package com.company;

import java.util.List;

public class Ship {

    private List<Square> NewShip;
    private ShipType shipType;


    public Ship(List<Square> newShip, ShipType shipType){
        NewShip = newShip;
        this.shipType = shipType;
    }

    public List<Square> getFields() {
        return NewShip;
    }

    public ShipType getShipType() {
        return shipType;
    }
    public void add(Square square){
        NewShip.add(square);
    }

    public boolean isPlaceGood (Ship ship1, List<Ship> ships,Board board){
        int count =0;
        for (int i = 0;i< ship1.getFields().size();i++){
            if(ship1.getFields().get(i).getY()> board.getSizeY()||
                    ship1.getFields().get(i).getX()> board.getSizeX()){
                count ++;
            }
            for (Ship ship : ships) {
                for (int z = 0; z < ship.getFields().size(); z++) {
                    if (ship1.getFields().get(i).getX() == ship.getFields().get(z).getX() &&
                            ship1.getFields().get(i).getY() == ship.getFields().get(z).getY()) {
                        count++;
                    }
                }
            }
        }
        return count == 0;
    }
}
