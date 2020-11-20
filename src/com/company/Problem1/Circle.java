package com.company.Problem1;

public class Circle {

    //region Properties
    private double radius;
    //endregion

    //region Constructors
    public Circle() {
    }

    public Circle( double radius ) {
        this.radius = radius;
    }
    //endregion

    //region Methods
    public double calculateArea() {
        return Math.pow(Math.PI, 2) * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    //endregion

    //region Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }
    //endregion
}
