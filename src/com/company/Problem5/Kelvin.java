package com.company.Problem5;

public class Kelvin {
    private double temperature;

    //region Constructors
    public Kelvin() {
    }

    public Kelvin( double temperature ) {
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
