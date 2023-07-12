/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky130623;

/**
 *
 * @author TUF GAMING
 */
public class Square extends shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public String getName() {
        return "Square";
    }
    
    public double getArea() {
        return side * side;
    }
}

