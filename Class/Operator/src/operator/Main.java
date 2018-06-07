/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    public static double inputNumber(double a) {
        Scanner input = new Scanner(System.in);
        
        try {
            a = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap so!!");
        }
        return a;
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isNext = true;
        do {

            System.out.print("Nhap a = ");
            double a = inputNumber(15);

            System.out.print("Nhap b = ");
            int b = Integer.parseInt(input.nextLine());

            System.out.print("Chon phep tinh: ");
            String opt = input.nextLine();

            switch (opt) {
                case "+":
                    System.out.printf("%d + %d = %d", a, b, (a + b));
                    break;
                case "-":
                    System.out.printf("%d - %d = %d", a, b, (a - b));
                    break;
                case "*":
                    System.out.printf("%d * %d = %d", a, b, (a * b));
                    break;
                case "/":
                    try {
                        System.out.printf("%d / %d = %d", a, b, (a / b));
                    } catch (ArithmeticException e) {
                        System.out.println("Khong chia duoc cho 0");
                    }
                    break;
                default:
                    System.out.println("Moi nhap lai!!");
            }
            System.out.println("Ban muon tiep tuc?");
            String next = input.nextLine();
            if (next.equals("khong")) {
                isNext = false;
            }
        } while (true);
    }

}
