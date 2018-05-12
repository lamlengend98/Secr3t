/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_exc;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Class_exc {

    
    public static void main(String[] args) {
        int choice ;        
        StudentManage sm = new StudentManage();
        
        do{
        System.out.println("-------Student Manager-------");
        System.out.println("1.\tList");
        System.out.println("2.\tSearch");
        System.out.println("3.\tAdd");
        System.out.println("4.\tExit");
        System.out.print("Choice: ");
        choice = Integer.parseInt(new Scanner(System.in).nextLine());
        switch(choice){
            case 1:
                sm.list();
                break;
                
            case 2:
                System.out.print("Name: ");
                String name = new Scanner(System.in).nextLine();
                sm.search(name);
                break;
                
            case 3: 
                Student stud = new Student();
                System.out.print("Name: ");                
                stud.setName(new Scanner(System.in).nextLine());
                
                System.out.print("\nEmail: ");
                stud.setEmail(new Scanner(System.in).nextLine());
                
                System.out.print("\nAge: ");
                stud.setAge(new Scanner(System.in).nextInt());
                break;
           
            case 4:
                System.exit(0);
                break;
                
            default:
                System.out.println("Error!!");
        }
        }while(true);
        
    }
    
}
