package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;

public class RunnableThread implements Runnable{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());
    @Override
    public void run() {
        try {
            LOGGER.info("Thread " + Thread.currentThread().getId() + " is running.");
        } catch (Exception e) {
        LOGGER.error(e);
        }
    }
}
