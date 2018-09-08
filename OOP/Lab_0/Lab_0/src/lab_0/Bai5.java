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
public class Bai5 extends Scaner {
    public void input(){
        int sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Tong la: "+sum);
    }
}
