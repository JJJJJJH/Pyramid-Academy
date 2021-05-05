package com.company;

public class Display {

    public Display(){ }

    public void printMenu(){
        System.out.println(" _           _   _   _           _     _       \n" +
                "| |         | | | | | |         | |   (_)      \n" +
                "| |__   __ _| |_| |_| | ___  ___| |__  _ _ __  \n" +
                "| '_ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\ \n" +
                "| |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |\n" +
                "|_.__/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/ \n" +
                "                                        | |    \n" +
                "                                        |_|   ");
        System.out.println("GAME START: ");

    }
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMainMenuOptions(){ }

    public void printExitMessage(){
        System.out.println("Exit game.");
    }
    public void printBoard(Board board){

    }
}
