/* *******************************************
Title:      COSC1200 Week 4 Practice Problem 2
Author:     Clint MacDonald
Date:       Jan 30, 2024
Purpose:    String and char manipulation!
 */
import java.util.Scanner;

// Main Container Class
public class Main {

    // GlobalVars
    final static String VOWELS = "AEIOU";
    final static String NUMBERS = "0123456789";
    final static String CONSONANTS = "BCDFGHJKLMNPQRSTVWXYZ";

    // Main application start point
    public static void main(String[] args) {
        initApp();
        counter();
        closeApp();
    }

    private static void initApp() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to our letter counter");
        System.out.println("by Clint MacDonald");
        System.out.println("--------------------------------\n");

        String input = "";
        while (!input.equalsIgnoreCase("Y")) {
            input = Tools.getStringKeyPress("Do you want to start the application?");
        }
    }

    private static void counter() {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        while (!inputString.equalsIgnoreCase("exit")) {
            // get input from user
            inputString = Tools.getStringFromConsole("Please enter your string!");

            runCounts(inputString);
        }

    }

    private static void runCounts(String inputString){
        int vowelCount = 0, consCount = 0, numberCount = 0, otherCount = 0;
        String letter = "";

        for (int i = 0; i < inputString.length(); i++) {
            letter = String.valueOf(inputString.charAt(i)).toUpperCase();

            if (VOWELS.contains(letter)) vowelCount++;
            else if (NUMBERS.contains(letter)) numberCount++;
            else if (CONSONANTS.contains(letter)) consCount++;
            else otherCount++;
        }

        // Output
        System.out.println("The string was:       " + inputString);
        System.out.println("The length is:        " + inputString.length());
        System.out.println("Number of Vowels:     " + vowelCount);
        System.out.println("Number of Consonants: " + consCount);
        System.out.println("Number of Numbers:    " + numberCount);
        System.out.println("Number of Symbols:    " + otherCount + "\n\n");

    }

    private static void closeApp() {
        System.out.println("--------------------------------");
        System.out.println("   good-bye, exiting......");
        System.out.println("--------------------------------");
    }
}