package com.dejerzcode.entities;

public class Circle extends Figure{
    private double radius;

    public Circle(){

        this.setRadius(this.getHeight()/2);
        this.setSides(0);
        this.setHeight(0);
        this.setWidth(0);

    }
    @Override
    public double getArea() {

        return this.getRadius()*this.getRadius()*Math.PI;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
