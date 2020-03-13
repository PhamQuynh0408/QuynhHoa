/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author HP
 */
public class Circle {
    private String color = "red";
    private double radius;
    
    //constructor khoi tao doi tuong
    public Circle(){
    radius = 5;
    color = "blue";
    }
    
    public Circle(double radius){
    this.radius= radius;
    }

    public Circle (String color){
    this.color = color;
    }
    
    public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
    }
   
    
    /**
     * lay ra ban kinh
     * @return 
     */
    public double getRadius(){
        return radius;
    }
    /**
     * Lay ra mau sac
     * @return
     */
    public String getColor(){
    return color;
    }
    /**
     * lay ra dien tich
     * @return
     */
    public double getArea(){
    return radius * radius * Math.PI;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "color=" + color + ", radius=" + radius + '}';
    }
}

