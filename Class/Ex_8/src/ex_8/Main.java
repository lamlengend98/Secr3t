/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List l = new List();
        do{
            System.out.println("========================");
            System.out.println("1. Add.");
            System.out.println("2. List.");
            System.out.println("3. Search.");
            System.out.println("4. Exit.");
            System.out.print("Choice: ");
            int choice  = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("========================");
            
            switch(choice){
                case 1: 
                    l.input();
                    break;
                case 2: 
                    l.show();
                    break;
                case 3:
                    System.out.print("Type title: ");
                    l.search(new Scanner(System.in).nextLine());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choice again!!");
            }
        }while(true);
    }
    
}
