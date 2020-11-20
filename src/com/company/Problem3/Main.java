package com.company.Problem3;

import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        Random random = new Random();

        int sideA = random.nextInt(49) + 1;
        int sideB = random.nextInt(49) + 1;
        int sideC = random.nextInt(49) + 1;

        System.out.println("sideA -> " + sideA + "\n" + "sideB -> " + sideB + "\n" + "sideC -> " + sideC + "\n");

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        if (triangle.checkIfTriangleIsValid()) {
            System.out.println("Perimeter is -> " + triangle.findPerimeter());
            System.out.println("Area is -> " + triangle.findArea());
        } else {
            System.out.println("This triangle cannot exist !!");
        }
    }
}
