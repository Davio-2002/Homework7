package com.company.Problem5;

public class TemperatureConverter {

    //region Methods
    public Farenhait celsiusToFarenhait( Celsius celsius ) {
        Farenhait farenhait = new Farenhait();
        farenhait.setTemperature((celsius.getTemperature() * 1.8) + 32);
        return farenhait;
    }

    public Farenhait kelvinToFarenhait( Kelvin kelvin ) {
        Farenhait farenhait = new Farenhait();
        farenhait.setTemperature((kelvin.getTemperature() - 273.15) * 1.8 + 32);
        return farenhait;
    }

    public Celsius farenhaitToCelsius( Farenhait farenhait ) {
        Celsius celsius = new Celsius();
        celsius.setTemperature((farenhait.getTemperature() - 32) / 1.8);
        return celsius;
    }

    public Celsius kelvinToCelsius( Kelvin kelvin ) {
        Celsius celsius = new Celsius();
        celsius.setTemperature(kelvin.getTemperature() - 273.15);
        return celsius;
    }

    public Kelvin celsiusToKelvin( Celsius celsius ) {
        Kelvin kelvin = new Kelvin();
        kelvin.setTemperature(celsius.getTemperature() + 273.15);
        return kelvin;
    }

    public Kelvin farenhaitToKelvin( Farenhait farenhait ) {
        Kelvin kelvin = new Kelvin();
        kelvin.setTemperature((farenhait.getTemperature() - 32) * 5 / 9 + 273.15);
        return kelvin;
    }
    //endregion
}
