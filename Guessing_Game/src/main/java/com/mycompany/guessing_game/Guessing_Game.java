package com.mycompany.guessing_game;
import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numberToGuess = rand.nextInt(100) + 1; 
        int numberOfAttempts = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have randomly selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfAttempts + " attempts to guess the number.");
            }
        }

        sc.close();
    }
}
