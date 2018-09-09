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
public class Bai8 extends Scaner {
    public void input(){
        int mul = 1;
        double sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        System.out.println(n+"! = "+ giaithua(n));
        for (int i = 1; i <= n; i++) {
            sum += (double)i/giaithua(i);
        }
        System.out.printf("Tong la: %.2f\n",sum);
    }
    
    public static int giaithua(int n){
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
    public double tong(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += (double)i/giaithua(i);
        }
        return sum;
    }
}
