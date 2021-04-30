package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int guessNumber;
        int count = 1;
        int inputNum = 0;
        String inputName;
        String inputYorN = "y";

        Scanner in = new Scanner(System.in);


        System.out.println("Hello! What is your name?");
        inputName = in.nextLine();

        do {
            guessNumber = (int) Math.floor((Math.random() * (21 - 1)) + 1);

            System.out.println("Well, " + inputName + ", I am thinking of a number between 1 and 20.\n" +
                    "You can guess my number six times. Good luck!\n" +
                    "Take a guess.");
            count = 1;
            do {
                System.out.println("Enter number: ");
                inputNum = in.nextInt();
                if (inputNum < guessNumber) {
                    System.out.println("Your guess is too low.\n" +
                            "Take a guess.");
                    count++;


                } else if (inputNum > guessNumber) {
                    System.out.println("Your guess is too high.\n" +
                            "Take a guess.");

                    count++;
                } else {
                    System.out.println("Good job, " + inputName + "! You guessed my number in " + count + " guesses!\n" +
                            "Would you like to play it again? (y or n)");
                    inputYorN = in.nextLine();
                }

            } while (count <= 6 && inputYorN.equals("y"));
            if(count > 6){
                System.out.println("You guessed 6 times but still not right.\n" +
                        "Would you like to play it again? (y or n)");
            }


            System.out.println("Enter y or n: ");
            in.nextLine();
            inputYorN = in.nextLine();
            //in.nextLine();

            if (inputYorN.equals("n")) {
                break;
            }

        } while (inputYorN.equals("y"));

    }
}