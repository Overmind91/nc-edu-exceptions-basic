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
        try { // ������ ����� ��� � ������������ ������ ����������
            return s.length(); // ���� s == null, �� java ������ ����������
        } catch (Exception ex) { // ����� ���������� ������ ����
            return -1;
        } finally { // ���� ���� ����������� � ����� ������ � �����
            return 0;
        }
    }

    private static void exitTest() {
        try {
            System.out.println("Start");
            if (true) throw new RuntimeException(); // todo ���������������� � ���������
            System.exit(0); // ��� ������ ��������� ��������� ���������� ���������
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
