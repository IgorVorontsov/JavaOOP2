package com.example.java;

abstract class Rectangular implements Shape{

    double side;

    public Rectangular(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return Math.pow(this.side, 2);
    }
}


