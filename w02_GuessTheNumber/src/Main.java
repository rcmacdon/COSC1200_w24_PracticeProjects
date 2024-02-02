/* ***************************************
Title:  Week 2 Practice Problem - Guess the Number
Author: Clint MacDonald
Date:   Jan 182, 2024
Purpose:To practice actually writing Java for the first time
****************************************** */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        initializeGame();
        runGame();
    }

    //<editor-fold desc="Global Variable Declarations">
    static final int MIN_NUM = 1, MAX_NUM = 100;
    static int correctNumber = 0;

    //</editor-fold>

    //<editor-fold desc="Tools">
    private static int genRandInt(int lowerBound, int upperBound) {
        return (int)(Math.random() * upperBound + lowerBound);
    }
    //</editor-fold>

    //<editor-fold desc="Game Logic">
    private static void initializeGame() {
        correctNumber = genRandInt(MIN_NUM, MAX_NUM);
    }

    private static void runGame() {
        int userGuess, numGuesses = 0;
        do {
            numGuesses++;
            userGuess = getGuessFromUser();
            if (userGuess > correctNumber) {
                System.out.println("Sorry, your guess was too HIGH!");
            } else if (userGuess < correctNumber) {
                System.out.println("Sorry, your guess was too LOW!");
            }
        } while (userGuess != correctNumber);

        System.out.println("CONGRATS, you guess the correctnumber: " + correctNumber + " in " + numGuesses + " guess!");

    }

    private static int getGuessFromUser() {
        System.out.println("Please enter your guess (" + MIN_NUM + " - " + MAX_NUM + "): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();




    }
    //</editor-fold>
}
