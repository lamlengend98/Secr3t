/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

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
        ManageList ml = new ManageList();
        do{
        System.out.println("======================");
        System.out.println("1. Add");
        System.out.println("2. Print");
        System.out.println("3. Finish");
        System.out.print("Choice: ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("======================");
        
        switch(choice){
            case 1:
                ml.input();
                break;
            case 2: 
                ml.print();
                break;
            case 3: 
                System.exit(0);
                break;
            default:
                System.out.println("Choice again!!");
                
        }

        
        }while(true);
    }
    
}
