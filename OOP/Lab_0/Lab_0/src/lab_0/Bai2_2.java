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
public class Bai2_2 extends Scaner {
    public void input(){
        int sum = 0;
        for (int i = 0; i <= 10; i+=2) {
            sum += i*2;
        }
        System.out.println("Tong 10 so chan dau tien la: "+sum);
    }
}
