package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;

public class Printer {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(Printer.class);

    public static <T> void printAll(ArrayList<T> list) {
        list.forEach( (n) -> LOGGER.info(n));
    }

    public static void print(Object i) {
        LOGGER.info(i);
    }
}
