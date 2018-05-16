/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_buoi7;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Store s = new Store();
        do{
        System.out.println("-----------------------");
        System.out.println("1. Add Product.");
        System.out.println("2. List Product.");
        System.out.println("3. Search.");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("-----------------------");
        
        switch(choice){
            case 1:
                s.addProduct();
                break;
            case 2:
                s.listProduct();
                break;
            case 3:
                System.out.print("Type name: ");
                String name = input.nextLine();
                s.searchProduct(name);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Error!!\nChoice again ");
        }
        }while(true);
    }
    
}
