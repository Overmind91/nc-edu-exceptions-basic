package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Overmind on 01.11.2018.
 */
public class ForwardingTests {

    private static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void run() {
        System.out.println("\n*** Forwarding tests Begin! ***");

        try { // todo try to comment
            doSomething();
        } catch (UnsupportedOperationException e) {
            logger.error(e.getMessage());
        }

        try {
            doElse();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        System.out.println("\n*** Forwarding tests End! ***");
    }

    private static void doSomething() {
        doSomethingNext();
    }

    private static void doSomethingNext() {
        throw new UnsupportedOperationException("Unsupported!");
    }

    private static void doElse() {
        //doElseNext(); // todo uncomment and fix
    }

    private static void doElseNext() throws Exception{
        throw new Exception("Some exception");
    }
}
