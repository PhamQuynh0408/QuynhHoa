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
public class Student {
    private String name;
    private double gpa;
    
    public Student(){
    name = "Nguyen Van A";
    gpa = 4.6;
    }
    
    public Student(String name){
    this.name= name;
    }
    
    public Student(double gpa){
    this.gpa= gpa;
    }
    
    public Student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
    }
   public String getName(){
   return name;
   }
   public double getGpa(){
   return gpa;
   }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
   
   
}
