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
public class Bai2_1 extends Scaner {
    
    public void Bai2_1(){
        int sum = 0;
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("Tong "+ n + " so dau tien la: "+sum);

}
    
}
