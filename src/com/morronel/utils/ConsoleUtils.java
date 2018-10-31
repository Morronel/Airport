package com.morronel.utils;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {
    private static Scanner scanner = new Scanner(System.in);

    private ConsoleUtils() {
    }

    public static String readInputLine() {
        return scanner.nextLine();
    }

    public static String readInputLine(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static String readInputLine(List<String> messages) {
        for (String string : messages) {
            System.out.println(string);
        }
        return scanner.nextLine();
    }

    public static int readInputLineInteger(String message) {
        System.out.println(message);
        String input;
        while (!isNumeric(input = scanner.nextLine())){
            System.out.println("Please, enter a valid number!");
        }
        return Integer.parseInt(input);
    }

    private static boolean isNumeric(String string) {
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
