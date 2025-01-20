package com.codegym;

import com.codegym.resizeable.Colorable;
import com.codegym.resizeable.Resizeable;

public class Square extends Rectangle implements Colorable {
    private double side;
    public Square() {}
    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }


    @Override
    public void howtoColor() {
        System.out.println("How to color Square");
    }
}
