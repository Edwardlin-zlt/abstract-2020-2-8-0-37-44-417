package com;

public abstract class Chicken {
    public abstract String getType();

    public abstract double getPrice();

    public void sell() {
        System.out.printf("100元可以买%s %d只\n", this.getType(), (int)(100 / this.getPrice()));
    }

}
