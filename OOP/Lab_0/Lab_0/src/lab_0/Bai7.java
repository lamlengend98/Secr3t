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
public class Bai7 extends Scaner {
    public void input(){
        int mul = 1;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        System.out.println(n+"! = "+ giaithua(n));
    }
    
    public int giaithua(int n){
        int mul = 1;
        if(n == 0 || n == 1){
            return mul;
        } else {
            for (int i = 2; i <= n; i++) {
                mul *= i;
            }
        return mul;
        }
    }
}
