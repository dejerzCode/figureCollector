package com.dejerzcode.entities;

public abstract class Figure implements IFigure{
    private int sides;
    private String color;
    private double height;
    private double width;

    public void zoom(int percent){
        this.setHeight(this.getHeight()*percent/100);
        this.setWidth(this.getWidth()*percent/100);
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
