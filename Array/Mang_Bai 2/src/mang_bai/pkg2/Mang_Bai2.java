
package mang_bai.pkg2;

import java.util.Scanner;


public class Mang_Bai2 {

    
    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int [] arry;
        arry = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Phần tử thứ %d: ",i);
            arry[i] = input.nextInt();
        }
        
        
        int max = arry[0];
        int min = arry[0];
        int chia = arry[0];
        for(int i = 0; i < n; i++){
            if(arry[i] > max)
                max = arry[i];
            if(arry[i] < min)
                min = arry[i];
            if(arry[i] % 3 == 0)
                chia = arry[i];
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+min);
        System.out.println("Phần tử chia hết cho 3 trong mảng là: "+chia);
    }
}
    
    
