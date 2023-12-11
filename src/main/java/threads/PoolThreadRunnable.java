package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {

    private static final org.apache.logging.log4j.core.Logger LOGGER = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private Thread thread = null;
    private BlockingQueue taskQueue;
    private boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue queue){
        this.taskQueue = queue;
    }

    public void run(){
        this.thread = Thread.currentThread();
        while(!isStopped()){
            try{
                Runnable runnable = (Runnable) taskQueue.take();
                runnable.run();
            } catch(Exception e){
                LOGGER.error(e);
            }
        }
    }

    public synchronized void doStop(){
        isStopped = true;
        this.thread.interrupt();
    }

    public synchronized boolean isStopped(){
        return isStopped;
    }
}