package com.company.Problem6;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance -> ");
        double distance1 = scanner.nextDouble();
        double distance2 = scanner.nextDouble();

        System.out.println();

        DistanceConverter distanceConverter = new DistanceConverter();

        //region Meters -> Miles
        Meters meters = new Meters(distance1);

        Miles miles = distanceConverter.metersToMiles(meters);
        System.out.println(distance1 + " meter -> " + miles.getDistance() + " mile");
        //endregion

        //region Miles -> Meters
        Miles miles1 = new Miles(distance2);

        Meters meters1 = distanceConverter.milesToMeters(miles1);
        System.out.println(distance2 + " mile -> " + meters1.getDistance() + " meter");
        //endregion
    }
}
