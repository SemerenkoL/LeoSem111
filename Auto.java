package com.company;

public interface Auto {
    void drive();
    void brake();
    void turn(String direction);
    void openDoors(byte[] doorsArray);
    void openTrunk();
    void replenishStock(byte percent);

    default void startTheAuto(){
        System.out.println("Машина прошла обработку и готова к поездке!");
    }
}