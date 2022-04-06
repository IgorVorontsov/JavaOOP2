package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Verifying getSquare method for square
        System.out.println("Enter length of the square side: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);
        System.out.println("Square is = " + square.getSquare());


        //Verifying getSquare method for rectangle
        System.out.println("Enter length and width of the rectangle each one in new line: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Square of the rectangle is = " + rectangle.getSquare());


        //Verifying getSquare method for circle
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Circle square is = " + circle.getSquare());


        //Verifying getSquare method for ellipse
        System.out.println("Enter small and big radiuses of the ellipse each one in new line: ");
        double smRadius = scanner.nextDouble();
        double bgRadius = scanner.nextDouble();

        Oval ellipse = new Oval(bgRadius, smRadius);
        System.out.println("Square of the ellipse is = " + ellipse.getSquare());
    }
}
