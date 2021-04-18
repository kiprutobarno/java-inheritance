package com.java.learn;

public class Car extends Vehicle{
    private String model="Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();
        System.out.println(myCar.brand+" "+myCar.model);
    }
}