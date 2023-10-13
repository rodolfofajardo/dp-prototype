package com.ixns;

import com.ixns.domain.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShaped = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShaped.getType());
        clonedShaped.draw();

        clonedShaped = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShaped.getType());
        clonedShaped.draw();

        clonedShaped = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShaped.getType());
        clonedShaped.draw();
    }
}