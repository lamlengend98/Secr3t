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
public class Store {
    private Product[] products;
    private int size = 10;
    int index = 0;
    int index2= 0;
    Scanner input = new Scanner(System.in);
    int choice;

    public Store() {
        this.products = new Product[size];
        this.input = new Scanner(System.in);
    }      
    
    public void addProduct(){
        Camera c = new Camera();
        SmartPhone sp = new SmartPhone();
        
        System.out.print("Let choice (Camera or SmartPhone): ");
        
        do{
            choice = Integer.parseInt(input.nextLine());
            if(choice == 1){
                c.addNew();
                products[index++] = c;
                
            }
            else if(choice == 0){                        
                sp.addNew();
                products[index++] = sp;
                
            }
            if(choice !=1 && choice!=0){
                System.out.println("choice again");
            }
        }while(choice !=1 && choice!=0);
            
    }
    public void listProduct(){
        System.out.println("==============SmartPhone===============");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "idProduct", "nameProduct", "price"  , "quantity", "hasCamera", "idSim");
        for (int i = 0; i < index; i++) {
            if(products[i] instanceof SmartPhone) {
                System.out.println(products[i] + "\t");
            }
        }
        System.out.println("==============Camera===================");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "idProduct", "nameProduct", "price", "quantity", "hasWifi");
        for (int i = 0; i < index; i++) {
            if(products[i] instanceof Camera) {
                System.out.println(products[i] + "\t");
            }
        }
        
    }
    
    public void searchProduct(String name){
        boolean found = false;
        for(int i = 0;i < index; i++){
            if(products[i].getName().equals(name)){
                found = true;
                if(products[i] instanceof SmartPhone){
                    System.out.println("==============SmartPhone===============");
                    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "idProduct", "nameProduct", "price"  , "quantity", "hasCamera", "idSim");
                    System.out.println(products[i]+"\t" );
                }
                if(products[i] instanceof Camera){
                    System.out.println("==============Camera===================");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "idProduct", "nameProduct", "price", "quantity", "hasWifi");
                    System.out.println(products[i]+"\t" );
                }
            }
        }
        if(!found){
            System.out.println("Products not found!!");
        }
    }
    }

