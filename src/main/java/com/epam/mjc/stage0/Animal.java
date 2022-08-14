package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal () {}

    public String getDescription() {
        return ("This animal is mostly " + this.color + ". It has " +
                ((this.numberOfPaws == 1)?(" paw "):(this.numberOfPaws + " paws ")) + " and " + (this.hasFur?"a":"no") + " fur");
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setNumberOfPaws (int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public void setHasFur (boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getColor () {
        return this.color;
    }

    public int getNumberOfPaws () {
        return this.numberOfPaws;
    }

    public boolean getHasFur () {
        return this.hasFur;
    }
}
