package com.company;

public class Battleship {

    private Display display;
    private final Game game = new Game();
    private Input input;

    public Battleship(){
        display = new Display();
    }
    public  void start(){
        display.printMenu();
        mainMenu();
    }

    public void mainMenu(){
        int choice;
        boolean exit = false;
        input = new Input();


        while(!exit){
            display.printMainMenuOptions();
            System.out.println("Enter choice: ");
            System.out.println();
            choice = input.getIntegerMenuOption();
            switch (choice) {
                case 0 -> {
                    display.printMessage("Play!");
                    game.gameLogic();
                }
                case 1 -> {
                    display.printMessage("Exiting...");
                    exitGame();
                }
            }
        }

    }
    public void exitGame(){
        display.printExitMessage();
        System.exit(0);
    }

}
