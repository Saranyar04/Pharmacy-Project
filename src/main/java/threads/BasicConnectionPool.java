package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;
import java.sql.Connection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BasicConnectionPool implements ConnectionPool {

    private static Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());
    public static int INITIAL_POOL_SIZE = 10;
    private static BlockingQueue<CustomThread> pool = new ArrayBlockingQueue<>(INITIAL_POOL_SIZE);
    private volatile static ConnectionPool instance;

    public BasicConnectionPool(int initialPoolSize) {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.offer(new CustomThread());
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new BasicConnectionPool(INITIAL_POOL_SIZE);
        }
        return instance;
    }

    @Override
    public Connection getConnection() {
        synchronized (this) {
            try {
                return (Connection) pool.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void releaseConnection(Connection connection) {
        synchronized (this) {
            pool.offer((CustomThread) connection);
        }
    }

}
