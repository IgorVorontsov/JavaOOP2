package com.example.java;

class Rectangle extends Rectangular {

    double length;

    Rectangle(double side, double length) {
        super(side);
        this.length = length;
    }

    @Override
    public double getSquare() {
        return this.side * this.length;
    }

}
