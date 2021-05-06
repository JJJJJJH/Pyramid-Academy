package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {


    private Scanner scanner = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();

    int choice;
    List<Integer> CoodinatesAndShipType = new ArrayList<>();

    public List<Board> getBoards(){
        generateBoard();
        return  boards;
    }

    public void generateBoard() {
        int x = 10;
        int y = 10;
        System.out.println("GameBoard will be 10 X 10.");
        Board board1 = new Board(x, y);
        Board board2 = new Board(x, y);
        boards.add(board1);
        boards.add(board2);
    }

    public Input(){

    }

    public int getIntegerMenuOption(){
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private List<Integer> AskCoodForShipType(){
        this.CoodinatesAndShipType = new ArrayList<>();
        System.out.println("Select row: ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select col: ");
        int col = scanner.nextInt();
        scanner.nextLine();
        System.out.println("""
                Select ship:\s
                1.Carrier
                2.Battleship
                3.Destroyer
                4.Submarine
                5.Patrol Boat
                """);
        int shipType = scanner.nextInt();
        CoodinatesAndShipType.add(row);
        CoodinatesAndShipType.add(col);
        CoodinatesAndShipType.add(shipType);
        return CoodinatesAndShipType;
    }

    public Ship createShip(int player){
        int GamePlayer = player+1;
        Square shipPart;
        Ship ship;
        System.out.println("Player" + GamePlayer + " place ship");
        CoodinatesAndShipType = AskCoodForShipType();
        int row = CoodinatesAndShipType.get(0);
        int col = CoodinatesAndShipType.get(1);
        int shipType = CoodinatesAndShipType.get(2);
        shipPart = new Square(row, col, GameStatus.SHIP);
        ship = new Ship(new ArrayList<>(),ShipType.values()[shipType-1]);
        boards.get(player).buildShip(shipPart, ship);
        return ship;
    }

    public int[] shoot(int player){
        int GamePlayer = player+1;
        System.out.println("Player"+ GamePlayer + " shoot");
        System.out.println("Select row: ");
        int row = scanner.nextInt();
        System.out.println("Select col: ");
        int col = scanner.nextInt();
        return new int[]{row,col};
    }
}
