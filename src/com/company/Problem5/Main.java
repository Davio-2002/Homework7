package com.company.Problem5;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature -> ");
        double temperature1 = scanner.nextDouble();
        double temperature2 = scanner.nextDouble();
        double temperature3 = scanner.nextDouble();

        System.out.println();

        //region Celsius -> Farenhait, Kelvin
        System.out.println("Celsius -> Farenhait, Kelvin");
        Celsius celsius = new Celsius(temperature1);

        Farenhait farenhait = temperatureConverter.celsiusToFarenhait(celsius);
        System.out.println(temperature1 + "°C -> " + farenhait.getTemperature() + "°F");

        Kelvin kelvin = temperatureConverter.celsiusToKelvin(celsius);
        System.out.println(temperature1 + "°C -> " + kelvin.getTemperature() + "°K\n");
        //endregion

        //region Farenhait -> Kelvin, Celsius
        System.out.println("Farenhait -> Kelvin, Celsius");
        Farenhait farenhait1 = new Farenhait(temperature2);

        Kelvin kelvin1 = temperatureConverter.farenhaitToKelvin(farenhait1);
        System.out.println(temperature2 + "°F -> " + kelvin1.getTemperature() + "°K");

        Celsius celsius1 = temperatureConverter.farenhaitToCelsius(farenhait1);
        System.out.println(temperature2 + "°F -> " + celsius1.getTemperature() + "°C\n");
        //endregion

        //region Kelvin -> Celsius, Farenhait
        System.out.println("Kelvin -> Celsius, Farenhait");
        Kelvin kelvin2 = new Kelvin(temperature3);

        Celsius celsius2 = temperatureConverter.kelvinToCelsius(kelvin2);
        System.out.println(temperature3 + "°K -> " + celsius2.getTemperature() + "°C");

        Farenhait farenhait2 = temperatureConverter.kelvinToFarenhait(kelvin2);
        System.out.println(temperature3 + "°K -> " + farenhait2.getTemperature() + "°F\n");
        //endregion
    }
}
