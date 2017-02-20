package scanner;

import java.util.Scanner;

/**
 * Created by Anastasiya on 19.02.2017.
 */
public class ScanManager {
    private static Scanner readValue;

    public static float consoleReadFloat() {
        readValue = new Scanner(System.in);
        return readValue.nextFloat();
    }

    public static String consoleReadString() {
        readValue = new Scanner(System.in);
        return readValue.nextLine();
    }

    public static boolean consoleReadBoolean() {
        readValue = new Scanner(System.in);
        return readValue.nextBoolean();
    }
}
