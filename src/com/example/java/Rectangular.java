package com.example.java;

public abstract class Rectangular implements Shape{

    public double side;

    public Rectangular(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return Math.pow(this.side, 2);
    }
}


