package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;

public class RunnableThread implements Runnable{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private String name;

    public RunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        LOGGER.info("Start Thread: " + name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        LOGGER.error(e);
        }
        LOGGER.info("Ended Thread : " + name);
    }
}
