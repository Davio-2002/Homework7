package com.company.Problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area is -> " + circle.calculateArea());
        System.out.println("Perimeter is -> " + circle.calculatePerimeter());
    }
}
