package com.example.mondayhom;

public class Triangle {
    public float length1;
    public float length2;
    public float length3;
    public float high;

    public float getLength1(float length1) {
        this.length1 = length1;
        return length1;
    }

    public float getHigh(float high) {
        this.high = high;
        return high;
    }

    public float getSquare() {
        float square = (length1 * high) / 2;
        return square;
    }
}
