package com.example.mondayhom.Cat;

public class UsualCat {
    public float weight;
    public double length;
    public boolean isMeow = true;

    public void print() {
        System.out.println("She says Meow!");
        System.out.println("She eats!");
        System.out.println("She sleeps!");
    }

    //example:
    public void playing() {
    }

    public float getUsual(float weight) {
        this.weight = weight;
        return weight;
    }

    public double getUsual(double length) {
        this.length = length;
        return length;
    }

    public boolean getUsual() {
        return isMeow;
    }
}

