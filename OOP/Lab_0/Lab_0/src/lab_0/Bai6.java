/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_0;

import java.text.DecimalFormat;

/**
 *
 * @author USER
 */
public class Bai6 extends Scaner {
    public void input(){
        double sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= n; i++) {
            sum += (double)1/i;
        }
        
        System.out.printf("Tong la %.2f\n",sum);
    }
}
