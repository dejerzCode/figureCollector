package com.dejerzcode.entities;

public class Square extends Figure{

    public Square(){
        this.setSides(4);
    }
    @Override
    public double getArea() {
        return this.getHeight()*this.getWidth();
    }
}
