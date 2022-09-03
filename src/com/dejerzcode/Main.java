package com.dejerzcode;

import com.dejerzcode.entities.Circle;
import com.dejerzcode.entities.Square;
import com.dejerzcode.entities.Triangle;
import com.dejerzcode.utilities.MyActions;

public class Main extends MyActions {

    public static void main(String[] args) {
        Triangle newTriangle = new Triangle();
        Square newSquare = new Square();
        Circle newCircle = new Circle();
        boolean exit = false;
        do {
            switch (menu()){
                case 0:
                    print("Bye bye");
                    exit = true;
                    break;
                case 1:
                    setDimentions(newTriangle);
                    print("Area: " + newTriangle.getArea());
                    break;
                case 2:
                    setDimentions(newSquare);
                    print("Area: " + newSquare.getArea());
                    break;
                case 3:
                    setDimentions(newCircle);
                    print("Area: " + newCircle.getArea());
                    break;
                default:
            }
        } while (!exit);
    }
}
