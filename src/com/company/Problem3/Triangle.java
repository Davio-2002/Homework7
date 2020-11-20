package com.company.Problem3;

public class Triangle {

    //region Properties
    private int sideA;
    private int sideB;
    private int sideC;
    //endregion

    //region Constructors
    public Triangle() {
    }

    public Triangle( int sideA, int sideB, int sideC ) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //endregion

    //region Methods
    public boolean checkIfTriangleIsValid() {
        return (sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideA + sideC > sideB);
    }

    public double findPerimeter() {
        return sideA + sideB + sideC;
    }

    public double findArea() {
        double halfPerimeter = findPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
    //endregion

    //region Getters and Setters
    public int getSideA() {
        return sideA;
    }

    public void setSideA( int sideA ) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB( int sideB ) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC( int sideC ) {
        this.sideC = sideC;
    }
    //endregion
}
