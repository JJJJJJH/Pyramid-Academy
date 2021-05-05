package com.company;

public class Square {
    private int x;
    private int y;
    private GameStatus gameStatus;

    public Square(int x, int y, GameStatus gameStatus) {
        this.x = x;
        this.y = y;
        this.gameStatus = gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public char getChar() {
        char result = ' ';
        switch (gameStatus){
            case WATER:
                result = '~';
            case HIT:
                result = 'X';
            case SHIP:
                result = 'c';
            case MISS:
                result = 'm';
        }
        return result;
    }
}
