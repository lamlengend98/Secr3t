
package mang_bai3;

import java.util.Scanner;

public class Mang_Bai3 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();
        int [] arry = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.printf("Phần tử thứ %d là ",i);
            arry[i] = input.nextInt();
        }
        
        System.out.print("Phần tử cần tìm là: ");
        int a = input.nextInt();
             
        for(int i = 0; i < n; i++){
            if(arry[i] == a){
                System.out.println("Phần tử "+a+" nằm ở vị trí thứ "+(i));
                break;
            } else {
                System.out.println("Phần tử "+a+" không nằm trong mảng");
            }
        }
        
        
    }
    
   
}
