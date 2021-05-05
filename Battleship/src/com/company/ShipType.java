package com.company;

public enum ShipType {
    CARRIER(5),
    BATTLESHIP(4),
    DESTROYER(3),
    SUBMARINE(2),
    PATROLBOAT(1);


    public final Integer label;
    ShipType(Integer label){
        this.label = label;
    }

}
