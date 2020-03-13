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
public class Car {
    private String plateNumber;
    private String x;
    private String y;
    private double speed;
    
    public Car(){
        plateNumber = "T1908A";
        x = "HN";
        y = "TB";
        speed = 30;
}
    public Car(String plateNumber){
        this.plateNumber = plateNumber;
    }
    public Car(String x, String y){
    this.x = x;
    this.y = y;
    }
    public Car(String plateNumber , String x, String y){
    this.plateNumber = plateNumber;
    this.x = x;
    this.y = y;
    }
     public Car(String plateNumber , String x, String y, double speed){
    this.plateNumber = plateNumber;
    this.x = x;
    this.y = y;
    this.speed = speed;
    }
     
     public String move(){
         return plateNumber;
     }
     
     public String park(){
         return x;
     }
     
     public double accelerate(){
     return speed;
     }

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", x=" + x + ", y=" + y + ", speed=" + speed + '}';
    }
     
}
