package com.codegym;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println();

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println();

        triangle = new Triangle("black", false, 6, 8, 10);
        System.out.println(triangle);
        triangle.setColor("white");
        System.out.println(triangle);
    }
}
