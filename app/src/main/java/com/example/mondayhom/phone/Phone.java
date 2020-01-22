package com.example.mondayhom.phone;

public class Phone {
    public String color;
    public float diagonal;
    public boolean sim2;
    public int nuber;

    public int getNuber(int number) {
        this.nuber = number;
        return number;
    }

    public String getColor() {
        color = "Red";
        return color;
    }

    public float getDiagonal(float diagonal) {
        this.diagonal = diagonal;
        return diagonal;
    }

    public boolean getSim2() {
        return true;
    }
}
