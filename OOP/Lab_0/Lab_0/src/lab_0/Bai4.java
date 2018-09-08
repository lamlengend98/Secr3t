/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_0;

/**
 *
 * @author USER
 */
public class Bai4 extends Scaner {
    public void input(){
        int a,b,c,delta;
        double x,x1,x2;
        System.out.print("a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(input.nextLine());
        System.out.print("c = ");
        c = Integer.parseInt(input.nextLine());
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                x = -c/b;
                System.out.println("x = " + x);
            }
        }
        else {
            delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem x = " + x);
            } else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = "+x1+" va x2 = "+x2);
            }
        }
    }
}
