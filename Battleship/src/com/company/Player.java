package com.company;

import java.util.List;

public class Player {

    private List<Ship> ships;
    private Board board;
    private int remainingShips =0;

    public Player(List<Ship> ships, Board board) {
        this.ships = ships;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
    public int numberOfSquaresOfShips(List<Ship> ships){
        int sumOfAllSquares = 0;
        for (Ship ship: ships){
            sumOfAllSquares += ship.getShipType().label;
        }
        return sumOfAllSquares;
    }

    public  boolean handleShot(int x, int y){
        for(Ship ship:ships){
            for(Square square:ship.getFields()){
                if (square.getY() == y && square.getX() == x &&
                square.getGameStatus().equals(GameStatus.SHIP)){
                    square.setGameStatus(GameStatus.HIT);
                    board.getSquare(x, y).setGameStatus(GameStatus.HIT);
                    return true;
                }else if(square.getY() ==y && square.getX() == x &&
                square.getGameStatus().equals(GameStatus.HIT)){
                    square.setGameStatus(GameStatus.HIT);
                    board.getSquare(x,y).setGameStatus(GameStatus.HIT);
                    System.out.println("Already Hit");
                    return false;

                }
            }
        }
        board.getSquare(x, y).setGameStatus(GameStatus.MISS);
        System.out.println("Missed!");
        return false;
    }
}
