package com.company.Problem5;

public class Celsius {
    private double temperature;

    //region Constructors
    public Celsius() {
    }

    public Celsius( double temperature ) {
        this.temperature = temperature;
    }
    //endregion

    //region Getters and Setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature( double temperature ) {
        this.temperature = temperature;
    }
    //endregion
}
