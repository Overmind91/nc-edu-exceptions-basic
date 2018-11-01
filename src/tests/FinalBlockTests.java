package tests;

import java.util.*;

/**
 * Created by Overmind on 25.10.2018.
 */
public class FinalBlockTests {

    public static void run() {
        System.out.println("\n*** Final Block tests Begin! ***");

        System.out.println("stringSize(string): "+stringSize("string"));
        System.out.println("stringSize(null): " + stringSize(null));

        exitTest();

        System.out.println("*** Final Block tests End! ***");
    }

    private static int stringSize(String s) {
        try { // внутри блока код с возможностью ловить исключения
            return s.length(); // если s == null, то java бросит исключение
        } catch (Exception ex) { // ловим исключение любого типа
            return -1;
        } finally { // этот блок выполняется в любом случае в конце
            return 0;
        }
    }

    private static void exitTest() {
        try {
            System.out.println("Start");
            if (true) throw new RuntimeException(); // todo закомментировать и проверить
            System.exit(0); // эта строка мгновенно завершает выполнение программы
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("End");
        }
    }

//    private static void finalWithoutCatch() {
//        try {
//            doSmth();
//        } finally {
//
//        }
//    }
}
