import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.List;

public class ListPrinter<T> {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(Main.class);

    public ListPrinter(List<T> list) {
        list.forEach( (n) -> LOGGER.info(n));
    }

}
