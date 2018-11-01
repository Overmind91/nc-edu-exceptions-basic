package tests;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.SplittableRandom;

/**
 * Created by Overmind on 01.11.2018.
 */
public class LogTest {

    // using Log4j and slf4j libraries
    private static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void run() {
        System.out.println("\n*** Log tests Begin! ***");

        logger.error("Log error test");
        logger.warn("Log warn test");
        logger.info("Log info test");
        logger.debug("Log debug test");
        // todo выключить DEBUG логи, используйте INFO level

        try {
            if (true) throw new RuntimeException("something went wrong!");
        } catch (Exception e) {
            logger.error("e.getMessage(): "+e.getMessage()); // write exception message only
            logger.error("e.getStackTrace(): "+e.getStackTrace().toString()); // trying to write stacktrace
            //e.printStackTrace(); // todo uncomment and test - write to console, but this is bad practice
            logger.error("ExceptionUtils.getStackTrace(e): "+ExceptionUtils.getStackTrace(e)); // stack trace of healthy man
        }

        System.out.println("\n*** Log tests End! ***");
    }



}
