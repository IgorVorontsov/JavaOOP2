package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the square side: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);
        System.out.println("Square is = " + square.getSquare());



        System.out.println("Enter length and width of the rectangle each one in new line: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Square is = " + rectangle.getSquare());


    }
}
