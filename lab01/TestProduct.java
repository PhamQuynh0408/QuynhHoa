/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import lab01.Product;

/**
 *
 * @author HP
 */
public class TestProduct {
    public static void main(String[] args){
    Product product = new Product();
    double price1 = product.getPrice();
    int quantity1 = product.getQuantity();
    double price2 = product.setPrice(price1);
    System.out.println("price1" + price1 + "quantity1" + quantity1);
    
    Product product2 = new Product(1,"ruler",5.0,10,"dai 30cm");
    System.out.println(product.toString());
    
    Product product3 = new Product(15,12);
    System.out.println(product3.toString());
    
    Product product4 = new Product(10.2,12);
    System.out.println(product4.toString());
    }
}
