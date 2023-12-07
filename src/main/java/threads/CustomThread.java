package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;

public class CustomThread extends Thread {

    private final static Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                LOGGER.info(i);
            }
        }
        catch (Exception e) {
            LOGGER.error(e);
        }
    }
}
