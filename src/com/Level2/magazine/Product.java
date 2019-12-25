package com.Level2.magazine;

public class Product {

    private int cost, margin;

    public Product () {
        cost = (int) (Math.random() * 80 + 20);
        margin = (int) (Math.random() * 20 + 1);
    }

    public int getCost(){
        return cost;
    }

    public int getMargin() {
        return margin;
    }
}
