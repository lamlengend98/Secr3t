
package mang2_bai1;

import java.util.Scanner;

public class Mang2_Bai1 {
    private int m,n;
    private int [][] matrix;
    public static void main(String[] args) { 
        Mang2_Bai1 kt = new Mang2_Bai1();
        Scanner mt = new Scanner(System.in);
        System.out.print("Nhập vào số hàng: ");
        int m = mt.nextInt();
        System.out.print("Nhập vào số cột: ");
        int n = mt.nextInt();
        int [][] matrix = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Phần tử (%d, %d) là ",i,j);
                matrix[i][j] = mt.nextInt();
                
            }
            System.out.print("\n");
        }
        
        for(int i = 0; i< m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        //Tổng số cột
        for(int i = 0; i< m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + matrix[j][i];               
            }
            System.out.printf("\nCột thứ %d có tổng là: %d",i+1,sum);
        }
        
        //Tổng số hàng
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){        
                    sum = sum + matrix[i][j];                    
                }
            System.out.printf("\nHàng thứ %d có tổng là: %d",i+1,sum);            
            }
        System.out.print("\n");
        
        //Ma trận đơn vị
        kt.kiemTraDoiXung();
        
        //Ma trận 0
        kt.kiemTra0();
        
        //Ma trận đối xứng
        kt.kiemTraDonVi();
    }
    
    public void kiemTraDoiXung(){
        int flag = 0;
        if(m != n){
            System.out.println("Đây không phải là ma trận đối xứng");
        } else {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] != matrix[j][i])
                {
                    flag=1;
                    break;
                }
            }            
        }
        if(flag==1)
            System.out.println("Đây không phải là ma trận đối xứng");
        else
            System.out.println("Đây là ma trận đối xứng");
        }
    }
    
    public void kiemTra0(){
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] != 0)
                {
                    flag=1;
                    break;
                }
            }      
            if(flag == 1)
                break;
        }
        if(flag==1)
            System.out.println("Đây không phải là ma trận không");
        else
            System.out.println("Đây là ma trận không");
        }
        
   
    

    
    public void kiemTraDonVi(){
        int kt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    if(matrix[i][j] == 1 ){
                        kt = 1;                       
                    }
                    else{
                        kt = 0;
                        break;
                    }
            } else {
                if(matrix[i][j] == 0){
                    kt = 1;
                } 
                else{
                    kt = 0;
                    break;
                }
                }
        }
        }
            if(kt == 1){
                System.out.println("Đây là ma trận đơn vị");
            } else{
                System.out.println("Đây không phải ma trận đơn vị");
            }
    
    }
}
