package com.codegym;

import com.codegym.resizeable.Resizeable;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 5);

        Random r = new Random();
        for (Shape shape : shapes) {
            System.out.println("before resize: " + shape);
            double percent = 1 + r.nextInt(100);
            System.out.println("resizing by: " + percent + "%");

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            System.out.println("after resize: " + shape);
        }
    }
}
