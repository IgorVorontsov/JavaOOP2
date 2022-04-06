package com.example.java;

public class Rectangle extends Rectangular {

    double length;

    public Rectangle(double side, double length) {
        super(side);
        this.length = length;
    }

    @Override
    public double getSquare() {
        return this.side * this.length;
    }



}
