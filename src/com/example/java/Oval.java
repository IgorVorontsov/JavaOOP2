package com.example.java;

public class Oval extends Round{

    double smallRadius;

    public Oval(double radius, double smallRadius) {
        super(radius);
        this.smallRadius = smallRadius;
    }

    @Override
    public double getSquare() {
        return pi * this.radius * this.smallRadius;
    }
}
