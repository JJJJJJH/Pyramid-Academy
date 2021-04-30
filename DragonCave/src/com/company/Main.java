package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");

        Scanner caveScanner = new Scanner(System.in);
        System.out.println("ENTER 1 OR 2: ");
        String input1or2 = caveScanner.nextLine();

        if (input1or2.equals("1")) {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!");
        }else if(input1or2.equals("2")){
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Share you one chest of his treasure!");
        }else{
            System.out.println("INPUT ERROR.");
        }
    }
}
