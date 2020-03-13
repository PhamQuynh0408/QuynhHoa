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
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    
    public Product(){
        id = 1;
        name = "ruler";
        price = 5.0;
        quantity = 10;
        description = "dai 30cm";
    }
    
    public Product(int quantity ){
        this.quantity= quantity;
      
    }
    
    
    public Product(double price){
    this.price = price;
    }
    
    public Product(double price, int quantity){
    this.price = price;
    this.quantity = quantity;
    }
    
    public Product(int id,String name,double price,int quantity,String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    
    public int getId(){
    return id;
    }
    
    public String getName(){
    return name;
    }
    
    public double getPrice(){
    return price;
    }
    
    public double setPrice(double price){
    return price;
    }
    
    public int getQuantity(){
    return quantity;
    }
    
    public String getDescription(){
    return description;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description=" + description + '}';
    }

    
    
}
