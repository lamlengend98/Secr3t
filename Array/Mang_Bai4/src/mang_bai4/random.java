
package mang_bai4;

import java.util.Random;
import java.util.Scanner;

public class random {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arry = new int[15];
        Random rd = new Random();
        for(int i = 0; i < 15; i++){
            arry[i] = rd.nextInt(100);
            System.out.print(arry[i]+" ");
        }
        
        
        tangdan(arry);
        System.out.print("\nDãy số tăng dần là: ");
        Showtangdan(arry);
        giamdan(arry);
        System.out.print("\nDãy số giảm dần là: ");
        Showtangdan(arry);
    }
    
    public static void tangdan(int [] arry){
        int temp = arry[0];
        for(int i = 0; i < arry.length - 1; i++){
            for(int j = i + 1; j < arry.length; j++){
                if(arry[i] > arry[j]){
                    temp = arry[j];
                    arry[j] = arry[i];
                    arry[i] = temp;
                }
            }
        }
    }
    public static void Showtangdan(int [] arry){
        for(int i = 0; i < arry.length; i++){
                System.out.print(arry[i]+" ");
        }
    }
    
    public static void giamdan(int [] arry){
        int temp = arry[0];
        for(int i = 0; i < arry.length - 1; i++){
            for(int j = i + 1; j < arry.length; j++){
                if(arry[i] < arry[j]){
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
    }
    
    public static void Showgiamdan(int [] arry){
        for(int i = 0; i < arry.length; i++){
            System.out.println(i+" ");
        }
    }
}
