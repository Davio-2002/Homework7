package com.company.Problem4;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 -> ");
        int coordinateX1 = scanner.nextInt();

        System.out.print("y1 -> ");
        int coordinateY1 = scanner.nextInt();

        Point point = new Point(coordinateX1, coordinateY1);
        System.out.println("Distance between (0, 0) and (x1, y1) is -> " + point.distance());

        System.out.println("----------------------------------------------------");

        System.out.print("x2 -> ");
        int coordinateX2 = scanner.nextInt();

        System.out.print("y2 -> ");
        int coordinateY2 = scanner.nextInt();

        Point point1 = new Point(coordinateX2, coordinateY2);
        System.out.println("Distance between (x1, y1) and (x2, y2) is -> " + point.distance(point1));
    }
}
