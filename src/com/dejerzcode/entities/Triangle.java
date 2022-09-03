package com.dejerzcode.entities;

public class Triangle extends Figure{

    public Triangle(){
        this.setSides(3);
    }
    @Override
    public double getArea() {
        return this.getHeight()*this.getWidth()/2;
    }
}
