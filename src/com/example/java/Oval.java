package com.example.java;

class Oval extends Round {

    double smallRadius;

    Oval(double radius, double smallRadius) {
        super(radius);
        this.smallRadius = smallRadius;
    }

    @Override
    public double getSquare() {
        return pi * this.radius * this.smallRadius;
    }
}
