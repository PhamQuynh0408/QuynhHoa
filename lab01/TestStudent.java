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
public class TestStudent {
    public static void main (String[] agrrs){
    Student student = new Student ();
    String name1 = student.getName();
    
    System.out.println("name1" + name1);
    
    Student student2 = new Student();
    System.out.println(student.toString());
    
    Student student3 = new Student("Tran Van B", 7);
    System.out.println(student3.toString());
    }
}
