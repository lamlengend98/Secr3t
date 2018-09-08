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
public class Bai3 extends Scaner {
    public void input(){
        int a,b;
        double x;
        System.out.print("a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(input.nextLine());
        
        if (a == 0) {
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            x = -b/a;
            System.out.println("Phuong trinh co nghiem duy nhat x = "+x);
        }
    }
}
