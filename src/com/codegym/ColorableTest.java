package com.codegym;

import com.codegym.resizeable.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);          // Hình tròn với bán kính 5
        shapes[1] = new Rectangle(4, 6);   // Hình chữ nhật 4x6
        shapes[2] = new Square(3);         // Hình vuông với cạnh 3

        // Duyệt qua các phần tử và hiển thị thông tin
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howtoColor();
            }
        }
    }
}
