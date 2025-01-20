package com.codegym;

public class SqaureTest {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square();
        squares[1] = new Square(6);

        for (Square square : squares) {
            System.out.println(square);
        }


    }
}
