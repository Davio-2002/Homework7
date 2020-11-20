package com.company.Problem2;

public class Rectangle {

    //region Properties
    private double height;
    private double width;
    //endregion

    //region Constructors
    public Rectangle() {
    }

    public Rectangle( double height, double width ) {
        this.height = height;
        this.width = width;
    }
    //endregion

    //region Methods
    public double findPerimeter() {
        return 2 * (height + width);
    }

    public double findArea() {
        return height * width;
    }
    //endregion

    //region Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth( double width ) {
        this.width = width;
    }
    //endregion
}
