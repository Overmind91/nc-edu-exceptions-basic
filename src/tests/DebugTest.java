package tests;

import java.util.SplittableRandom;

/**
 * Created by Overmind on 01.11.2018.
 */
public class DebugTest {

    public static void run() {
        System.out.println("\n*** Debug tests Begin! ***");

        SplittableRandom random = new SplittableRandom();
        int result = 0;

        result = doSomeLogic(result, random.nextInt(1, 10));
        result = doSomeLogic(result, random.nextInt(1, 10));
        System.out.println("final result: "+result);
    }

    private static int doSomeLogic(int result, int x) {
        if (x == 1) {
            result += x;
        } else if (x == 2) {
            result += x * 2;
        } else if (x == 3) {
            result += x + 4;
        } else if (x == 4) {
            result += x / 2;
        } else if (x == 5) {
            result += x;
        } else if (x == 6) {
            result += x + 1;
        } else if (x == 7) {
            result += x + 2;
        } else if (x == 8) {
            result += x * 3;
        } else if (x == 9) {
            result += x + 3;
        } else if (x == 10) {
            result += x + 10;
        }
        return result;
    }

}
