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
public class TestCar {
    public static void main (String[] args){
    Car car1 = new Car();
    String plateNumber1 = car1.move();
    String x1 = car1.park();
    String y1 = car1.park();
    System.out.println("plateNumber1" + "x1" + "y1");
    
    Car c2 = new Car("ABC1");
    System.out.println(c2.toString());
    
    Car c3 = new Car("HN","TB");
    System.out.println(c3.toString());
    
    Car c4 = new Car("A12345","GHF","HF",40.5);
    System.out.println(c4.toString());
    }
}
