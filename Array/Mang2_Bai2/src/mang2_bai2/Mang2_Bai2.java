
package mang2_bai2;

import java.util.Scanner;

public class Mang2_Bai2 {
    
    
    public static void main(String[] args) {
        //In ma trận thứ 1
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhập số hàng ma trận 1: ");
        int hang1 = inp.nextInt();
        System.out.print("Nhập số cột ma trận 1: ");
        int cot1 = inp.nextInt();
        int [][] arry1 = new int[hang1][cot1];
        
        for(int i = 0; i < hang1; i++){
            for(int j = 0; j < cot1; j++){
                System.out.printf("Phần tử thứ (%d, %d) của ma trận 1 là: ",i,j);
                arry1 [i][j] = inp.nextInt();                
            }
            System.out.print("\n");
        }
        
        for(int i = 0; i < hang1; i++){
            for(int j = 0; j < cot1; j++){
                System.out.print(arry1[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        //In ma trận thứ 2
        System.out.print("\nNhập số hàng ma trận 2: ");
        int hang2 = inp.nextInt();
        System.out.print("Nhập số cột ma trận 2: ");
        int cot2 = inp.nextInt();
        int [][] arry2 = new int[hang2][cot2];
        
        for(int i = 0; i < hang2; i++){
            for(int j = 0; j < cot2; j++){
                System.out.printf("Phần tử thứ (%d, %d) của ma trận 2 là: ",i,j);
                arry2[i][j] = inp.nextInt();
            }
            System.out.print("\n");
        }
        
        for(int i = 0; i < hang2 ; i++){
            for(int j = 0; j < cot2; j++){
                System.out.print(arry2[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        //Tổng 2 ma trận
        int n = 0;
        int [][] arry3 = new int [hang2][cot2];
        for(int i = 0; i < hang1; i++){
            int sum = 0;
            for(int j = 0; j < hang2; j++){
                arry3[i][j] = arry1[i][j] + arry2[i][j];
                
            }
            System.out.print("\n");    
            
        }
        
        
        System.out.println("Tổng 2 ma trận là ");
        for(int i = 0; i < hang1; i++){
            int sum = 0;
            for(int j = 0; j < hang2; j++){
                
                System.out.print(arry3[i][j]+" ");
                
            }
                
            System.out.print("\n");
        }
        
        
    }
    
    
    
}
