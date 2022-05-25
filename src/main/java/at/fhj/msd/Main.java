package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    /**
     * Creates the logs.
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * @Author Kapellari Julian
     * Runs the application
     */
    public static void main(String[] args) {

        logger.error("It is an error logger.");

        //Isn't printed on the console!
        logger.info("It is a info logger.");

        // logger.debug("It is a debug logger.");
        // logger.fatal("It is a fatal logger.");
        // logger.trace("It is a trace logger.");
        // logger.warn("It is a warn logger.");

    }

}
