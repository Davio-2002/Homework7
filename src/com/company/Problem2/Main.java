package com.company.Problem2;

import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        Random random = new Random();

        int height = random.nextInt(999) + 1;
        int width = random.nextInt(999) + 1;

        System.out.println("Height -> " + height);
        System.out.println("Width -> " + width);

        Rectangle rectangle = new Rectangle(height, width);

        System.out.println("Perimeter is -> " + rectangle.findPerimeter());
        System.out.println("Area is -> " + rectangle.findArea());

        System.out.println("------------------");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(height);
        rectangle1.setWidth(width);

        System.out.println("Perimeter is -> " + rectangle.findPerimeter());
        System.out.println("Area is -> " + rectangle.findArea());
    }
}
