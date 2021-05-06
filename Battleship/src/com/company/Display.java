package com.company;

public class Display {

    public Display() {
    }

    public void printMenu() {
        System.out.println(" _           _   _   _           _     _       \n" +
                "| |         | | | | | |         | |   (_)      \n" +
                "| |__   __ _| |_| |_| | ___  ___| |__  _ _ __  \n" +
                "| '_ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\ \n" +
                "| |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |\n" +
                "|_.__/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/ \n" +
                "                                        | |    \n" +
                "                                        |_|   ");
        System.out.println("GAME STARTING ........ ");

    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMainMenuOptions() {
        System.out.println("press: \n" +
                "\t 0 - Play Game\n" +
                "\t 1 - Exit Game\n");
    }

    public void printExitMessage() {
        System.out.println("Exit game.");
    }

    public void printBoard(Board board) {
        System.out.print("   ");
        for (int i = 0; i< board.getSizeX(); i ++){
            System.out.print(i+ "  ");
        }
        System.out.println();
        for (int row = 0; row < board.getSizeX(); row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board.getSizeY(); col++) {
                switch (board.getSquare(row, col).getChar()) {
                    case '~' -> System.out.print(" ~ ");
                    case 'X' -> System.out.print(" X ");
                    case 'c' -> System.out.print(" c ");
                    case 'm' -> System.out.print(" m ");
                    case '-' -> System.out.print(" - ");
                }

            }
            System.out.println();


        }

    }
}
