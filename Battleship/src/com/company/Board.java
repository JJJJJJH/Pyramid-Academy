package com.company;

import java.util.Scanner;

public class Board {
    private  int sizeX;
    private int sizeY;
    Square matrix[][];


    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillBoard(sizeX, sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Square getSquare(int x, int y) {
        return matrix[x][y];
    }

    public Square[][] fillBoard(int x, int y) {
        matrix = new Square[sizeX][sizeY];
        for (int row = 0; row<x; row++){
            for(int col = 0; col <y ; col++){
                matrix[row][col] = new Square(row, col, GameStatus.WATER);
            }
        }
        return  matrix;
    }
    public  void buildShip(Square square, Ship ship){
        System.out.println("""
                How do you want to place you ship?
                Vertical or Horizontal? (Enter v or h)
                """);
        Scanner scanner = new Scanner(System.in);
        String vorh = scanner.nextLine();
        int x = square.getX();
        int y = square.getY();

        if (vorh.equals("h")){

            switch (ship.getShipType().label) {
                case 1 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);

                }
                case 2 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x, y + 1, GameStatus.SHIP));

                }
                case 3 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x, y + 1, GameStatus.SHIP));
                    ship.add(new Square(x, y + 2, GameStatus.SHIP));

                }
                case 4 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x, y + 1, GameStatus.SHIP));
                    ship.add(new Square(x, y + 2, GameStatus.SHIP));
                    ship.add(new Square(x, y + 3, GameStatus.SHIP));

                }
                case 5 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x, y + 1, GameStatus.SHIP));
                    ship.add(new Square(x, y + 2, GameStatus.SHIP));
                    ship.add(new Square(x, y + 3, GameStatus.SHIP));
                    ship.add(new Square(x, y + 4, GameStatus.SHIP));

                }
            }
        }
        else if(vorh.equals("v")){
            switch (ship.getShipType().label) {
                case 1 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                }
                case 2 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x + 1, y, GameStatus.SHIP));
                }
                case 3 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x + 1, y, GameStatus.SHIP));
                    ship.add(new Square(x + 2, y, GameStatus.SHIP));
                }
                case 4 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x + 1, y, GameStatus.SHIP));
                    ship.add(new Square(x + 2, y, GameStatus.SHIP));
                    ship.add(new Square(x + 3, y, GameStatus.SHIP));
                }
                case 5 -> {
                    square.setGameStatus(GameStatus.SHIP);
                    ship.add(square);
                    x = square.getX();
                    y = square.getY();
                    ship.add(new Square(x + 1, y, GameStatus.SHIP));
                    ship.add(new Square(x + 2, y, GameStatus.SHIP));
                    ship.add(new Square(x + 3, y, GameStatus.SHIP));
                    ship.add(new Square(x + 4, y, GameStatus.SHIP));
                }
            }


        }


    }

}
