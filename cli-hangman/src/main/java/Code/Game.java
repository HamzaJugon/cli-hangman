package Code;

import java.util.Scanner;

public class Game {
    private WordBank wordBank;
    private Hangman hangman;
    private String wordToGuess;
    private StringBuilder currentGuess;
    private int attemptsLeft;
    private boolean isGameWon;

    public Game() {
        wordBank = new WordBank();
        hangman = new Hangman();
        attemptsLeft = 6; // Standard hangman allows 6 wrong guesses
        wordToGuess = wordBank.getRandomWord();
        currentGuess = new StringBuilder("_".repeat(wordToGuess.length()));
        isGameWon = false;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");

        while (attemptsLeft > 0 && !isGameWon) {
            displayCurrentState();

            System.out.print("Enter your guess (single letter): ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
                System.out.println("Invalid input. Please enter a single letter.");
                continue;
            }

            processGuess(guess.charAt(0));
        }

        scanner.close();

        if (isGameWon) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game Over! The word was: " + wordToGuess);
        }
    }

    private void displayCurrentState() {
        System.out.println("\nCurrent Word: " + currentGuess.toString());
        hangman.draw(attemptsLeft);
        System.out.println("Attempts left: " + attemptsLeft);
    }

    private void processGuess(char guess) {
        if (wordToGuess.contains(String.valueOf(guess))) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    currentGuess.setCharAt(i, guess);
                }
            }
            if (currentGuess.toString().equals(wordToGuess)) {
                isGameWon = true;
            }
        } else {
            attemptsLeft--;
            System.out.println("Wrong guess!");
        }
    }
}