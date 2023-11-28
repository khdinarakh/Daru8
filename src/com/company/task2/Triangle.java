package com.company.task2;

import java.util.Objects;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;


    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double calculateArea (){
        double semiPerimeter = calculatePerimeter() / 2;
        return  Math.sqrt(semiPerimeter * (semiPerimeter - getSide1()) * (semiPerimeter - getSide2()) * (semiPerimeter - getSide3()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getSide1() == triangle.getSide1() && getSide2() == triangle.getSide2() && getSide3() == triangle.getSide3();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide1(), getSide2(), getSide3());
    }

    public Triangle clone() {
        return new Triangle(this.side1, this.side2, this.side3);
    }
}
