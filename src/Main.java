import tests.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FinalBlockTests.run();
        DebugTest.run();
        LogTest.run();
        ForwardingTests.run();
        // MultiCatchTest todo
    }
}

