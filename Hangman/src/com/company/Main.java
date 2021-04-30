package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void main(String[] args) {
        // write your code here
        //--init for play again:

        String yorn = "y";

        //-- here is the do loop for play again:
        do {

            //init
            String[] words = {"apple", "cat", "fish", "sister"};
            String missed = "";
            String guessed = "";
            Scanner in = new Scanner(System.in);
            int missCount = 0;
            String ansbar;


            //--random choose a word from words list:
            Random random = new Random();
            int wordIndex = random.nextInt(words.length);
            String word = words[wordIndex];
            //System.out.println(word);
            //-- set ansbar:
            ansbar = "_".repeat(word.length());

            //-- arr of letters
            //String[] arr = word.split("");
            //System.out.println(Arrays.toString(arr));

            //--Create hanger UI:
            System.out.println("H A N G M A N\n" +
                    "+---+\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "    ===\n" +
                    "Missed letters: " + missed + "\n" +
                    ansbar + "\n" +
                    "Guess a letter.");

            //-- here is the huge Do-While loop for the game body:
            do {

                //-- input the guess:
                String letter = in.nextLine();
                while (missed.contains(letter)) {
                    System.out.println("You guessed this letter.Try others: ");
                    letter = in.nextLine();
                }

                //-- check letter in word or not:
                //-- if so, replace letter with "_",
                //-- otherwise, add letter to missed string
                if (!word.contains(letter)) {

                    missed += letter;
                    missCount++;

                    //-- replace all letter in word to ansbar on the same position
                    //-- 1. convert String letter to char l
                    //-- 2. find all indexes of l in word
                    //-- 3. use changeCharInPosition method to switch l into ansbar
                } else {
                    char l = letter.charAt(0);

                    for (int index = word.indexOf(l);
                         index >= 0;
                         index = word.indexOf(l, index + 1)) {
                        ansbar = changeCharInPosition(index, l, ansbar);
                    }

                }

                //--Hangman output:

                switch (missCount) {
                    case 0 -> System.out.println("H A N G M A N\n" +
                            "+---+\n" +
                            "      |\n" +
                            "      |\n" +
                            "      |\n" +
                            "    ===\n" +
                            "Missed letters: " + missed + "\n" +
                            ansbar + "\n" +
                            "Guess a letter.");
                    case 1 -> System.out.println("H A N G M A N\n" +
                            "+---+\n" +
                            "O     |\n" +
                            "      |\n" +
                            "      |\n" +
                            "    ===\n" +
                            "Missed letters: " + missed + "\n" +
                            ansbar + "\n" +
                            "Guess a letter.");
                    case 2 -> System.out.println("H A N G M A N\n" +
                            "+---+\n" +
                            "O     |\n" +
                            "|     |\n" +
                            "      |\n" +
                            "    ===\n" +
                            "Missed letters: " + missed + "\n" +
                            ansbar + "\n" +
                            "Guess a letter.");
                    case 3 -> System.out.println("H A N G M A N\n" +
                            "+---+\n" +
                            "O     |\n" +
                            "|     |\n" +
                            "/     |\n" +
                            "    ===\n" +
                            "Missed letters: " + missed + "\n" +
                            ansbar + "\n" +
                            "Guess a letter.");
                    case 4 -> System.out.println("H A N G M A N\n" +
                            "+---+\n" +
                            "O     |\n" +
                            "|     |\n" +
                            "/\\    |\n" +
                            "    ===\n" +
                            "Missed letters: " + missed + "\n" +
                            ansbar + "\n" +
                            "Game over!");
                }
            } while (!ansbar.equals(word) && missCount <= 3);
            if (ansbar.equals(word)) {
                System.out.println("Yes! You won!");
            } else {
                System.out.println("Sorry! Game Over! You are hanged.");
            }
            System.out.println("Do you want to play again? (y or n)");
            yorn = in.nextLine();
        } while (yorn.equals("y"));
    }
}
