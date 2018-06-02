/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoexception;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main extends Excep{

    
    public static void main(String[] args) {
        Excep e = new Excep();
        Scanner input = new Scanner(System.in);
        
        do{
            try{
                System.out.print("Nhap a = ");
                int a = Integer.parseInt(input.nextLine());
                System.out.print("Nhap b = ");
                int b = Integer.parseInt(input.nextLine());

                System.out.print("Chon phep tinh (+,-,*,/): ");
                String opt = input.nextLine();
                
                switch(opt){
                    case "cong":
                        System.out.println("a + b = "+(a+b));
                        break;
                    case "tru":
                        System.out.println("a - b = "+(a-b));
                        break;
                    case "nhan":
                        System.out.println("a * b = "+(a*b));
                        break;
                    case "chia":
                        try{
                            System.out.println("a / b = "+(a/b));
                        } catch(ArithmeticException e2){
                        System.out.println("Khong duoc nhap 0");
                        }
                        break;
                    default:
                        System.out.println("Moi ban chon lai!!");
                }
                
            
            } catch(NumberFormatException ex){
                System.out.println("Vui long nhap so");
            }
            
        }while(true);
    }
    
}
