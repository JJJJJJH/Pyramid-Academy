package com.company;

import java.util.*;

public class Main {
    static ArrayList<String> personPositions = new ArrayList<>();
    static ArrayList<String> AIPositions = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        //INITS:
        Scanner input = new Scanner(System.in);
        String playagain = "y";
        String player;
        String result;
        do {
            personPositions.clear();
            AIPositions.clear();

            // Code body:
            System.out.println("""
                    Welcome to Tic-Tac-Toe!
                    Do you want to be X or O?
                    """);

            String XorO = input.nextLine();

            if (XorO.equals("X")) {
                System.out.println("The Computer will go first");
                player = "AI";
            } else if (XorO.equals("O")) {
                System.out.println("You will go first");
                player = "person";
            }

            //game board
            String[][] gameBoard = {{" ", "|", " ", "|", " "},
                    {"---------"},
                    {" ", "|", " ", "|", " "},
                    {"---------"},
                    {" ", "|", " ", "|", " "}};

            printGameBoard(gameBoard);
            System.out.println("If computer play first, press enter to show its piece");
            do {
                System.out.println("What is you next move? (1-9)");
                String personPos = input.nextLine();
                while (personPositions.contains(personPos) || AIPositions.contains(personPos)) {
                    System.out.println("Position taken! Enter a correct Position");
                    personPos = input.nextLine();
                }

                placePiece(gameBoard, personPos, "person");
                Random rand = new Random();
                String AIPos = String.valueOf(rand.nextInt(9) + 1);
                while (personPositions.contains(AIPos) || AIPositions.contains(AIPos)) {
                    //System.out.println("Position taken! Enter a correct Position");
                    AIPos = String.valueOf(rand.nextInt(9) + 1);
                }

                placePiece(gameBoard, AIPos, "AI");

                printGameBoard(gameBoard);


                result = checkWinner();
                if (result.length() > 0) {
                    System.out.println(result);
                    System.out.println("Do you wanna play it again? (y or n)");
                    playagain = input.nextLine();

                }
            } while (result.length()==0);

        } while (playagain.equals("y"));


    }

    public static void printGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String s : row) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void placePiece(String[][] gameBoard, String pos, String player) {
        String symbol = " ";

        if (player.equals("person")) {
            symbol = "O";
            personPositions.add(pos);
        } else if (player.equals("AI")) {
            symbol = "X";
            AIPositions.add(pos);
        }
        switch (pos) {
            case "1":
                gameBoard[0][0] = symbol;
                break;
            case "2":
                gameBoard[0][2] = symbol;
                break;
            case "3":
                gameBoard[0][4] = symbol;
                break;
            case "4":
                gameBoard[2][0] = symbol;
                break;
            case "5":
                gameBoard[2][2] = symbol;
                break;
            case "6":
                gameBoard[2][4] = symbol;
                break;
            case "7":
                gameBoard[4][0] = symbol;
                break;
            case "8":
                gameBoard[4][2] = symbol;
                break;
            case "9":
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

        }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList("1", "2", "3");
        List midRow = Arrays.asList("4", "5", "6");
        List bottomRow = Arrays.asList("7", "8", "9");
        List leftCol = Arrays.asList("1", "4", "7");
        List midCol = Arrays.asList("2", "5", "8");
        List rightCol = Arrays.asList("3", "6", "9");
        List crossL = Arrays.asList("1", "5", "9");
        List crossR = Arrays.asList("3", "5", "7");


        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(crossL);
        winning.add(crossR);

        for (List l : winning) {
            if (personPositions.containsAll(l)) {
                return "Congratulations! You won! Chicken dinner!";
            } else if (AIPositions.containsAll(l)) {
                return "The computer has beaten you! You lose.";
            } else if (personPositions.size() + AIPositions.size() == 9) {
                return "TIE!";
            }
        }
        return "";

    }

}
