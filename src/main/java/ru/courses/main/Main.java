package ru.courses.main;

import ru.courses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println("ru.courses.geometry.Point: " + point1);

        java.awt.Point point2 = new java.awt.Point(30, 40);
        System.out.println("java.awt.Point: " + point2);
    }
}
