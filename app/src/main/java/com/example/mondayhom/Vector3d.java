package com.example.mondayhom;

public class Vector3d {
    public int x = 2;
    public int y = 3;
    public int z = 1;

    public void Vector() {
        System.out.println("Vector koordin " + "(" + x + ":" + y + ":" + z + ")");
    }

    public void getSumV(int x1, int y1,int z1) {
        System.out.println("Vectors Sum " + "(" +(x1 + x) + ":" + (y1 + y) + ":" + (z1 + z) + ")");
    }
}
