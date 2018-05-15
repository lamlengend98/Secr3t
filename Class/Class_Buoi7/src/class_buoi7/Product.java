/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_buoi7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
        
    public void addNew(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input name's product: ");
        this.setName(input.nextLine()); 
        
        System.out.print("Input id's product: ");
        this.setId(Integer.parseInt(input.nextLine()));
        
        System.out.print("Input price's product: ");
        this.setPrice(Double.parseDouble(input.nextLine()));
        
        System.out.print("Input quantity's product: ");
        this.setQuantity(Integer.parseInt(input.nextLine()));
        
    }
    @Override
    public String toString() {
        return this.id + "\t\t" + this.name + "\t\t" + this.price + "\t" + this.quantity;
    }
}
