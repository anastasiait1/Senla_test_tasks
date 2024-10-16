package org.Hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "да";

        while (answer.equalsIgnoreCase("да")) {
            hangman(scanner);
            System.out.println("\nХочешь играть снова? (да или нет): ");
            answer = scanner.nextLine();
        }

        scanner.close();
    }

    public static void hangman(Scanner scanner) {
        System.out.println("Привет! Давай сыграем в виселицу!");

        List<String> words = new ArrayList<String>();
        words.add("аэропорт");
        words.add("светофор");
        words.add("машина");
        words.add("грузовик");
        words.add("партизан");
        words.add("репетитор");
        words.add("огород");
        words.add("император");
        words.add("циклон");
        words.add("колонна");
        words.add("учебник");

        Random random = new Random();
        String secret = words.get(random.nextInt(words.size()));
        String guesses = "";
        int turns = 5;

        while (turns > 0) {
            int missed = 0;
            for (char letter : secret.toCharArray()) {
                if (guesses.indexOf(letter) != -1) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print("_ ");
                    missed++;
                }
            }

            if (missed == 0) {
                System.out.println("\nТы выиграл!");
                break;
            }

            System.out.println("\nНазови букву: ");
            String guess = scanner.nextLine().toLowerCase();
            guesses += guess;

            if (secret.indexOf(guess) == -1) {
                turns--;
                System.out.println("\nНе угадал :(");
                System.out.println("\nОсталось попыток: "+ turns);

                if (turns < 5) {
                    System.out.println("\n | ");
                }
                if (turns < 4) {
                    System.out.println(" O ");
                }
                if (turns < 3) {
                    System.out.println(" /|\\ ");
                }
                if (turns < 2) {
                    System.out.println(" | ");
                }
                if (turns < 1) {
                    System.out.println(" / \\ ");
                }
                if (turns == 0) {
                    System.out.println("\n\nЭто слово: " + secret);
                }
            }
        }
    }

}
