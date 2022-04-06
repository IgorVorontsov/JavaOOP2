package com.example.java;

public abstract class Round implements Shape {

    final static double pi = 3.14159;
    public double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return pi * Math.pow(this.radius, 2);
    }



}
