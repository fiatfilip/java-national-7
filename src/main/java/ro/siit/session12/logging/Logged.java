package ro.siit.session12.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logged {
    private static final Logger LOGGER = LogManager.getLogger(Logged.class);
    public static void main(String[] args) {
        System.out.println("Some message");
        System.out.println(LOGGER.isDebugEnabled());
        LOGGER.info("Debug message");
    }
}
