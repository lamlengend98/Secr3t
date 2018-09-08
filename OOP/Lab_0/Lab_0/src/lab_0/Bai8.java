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
        //Tao va nhap mang
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int [] arry = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu "+(i+1)+": ");
            arry[i] = input.nextInt();
        }
        //In cac phan tu mang
        for (int i = 0; i < arry.length; i++) {
            System.out.println("arry["+i+"] = "+arry[i]);
        }
        //In ra gia tri lon nhat, nho nhat
        int min = arry[0];
        int max = arry[0];
        
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]<min){
                min = arry[i];
            } else if(arry[i] > max){
                max = arry[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la "+min);
        System.out.println("Gia tri lon nhat cua mang la "+max);
        
        //Dem so phan tu chan
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arry[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("So phan tu chan la "+dem);
        
        //In ra phan tu la so nguyen to
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNguyenTo(arry[i])) {
                System.out.println("Phan tu la so nguyen to la "+arry[i]);
            }
        }
        
        //Sap xep phan tu mang
        SortASC(arry);
        System.out.println("Mang sau khi duoc sap xep theo thu tu tang dan la: ");
        show(arry);
        
        SortDESC(arry);
        System.out.println("\nMang sau khi duoc sap xep theo thu tu giam dan la: ");
        show(arry);
        
        //Tim kiem phan tu mang
        System.out.print("\nNhap phan tu muon tim kiem: ");
        int k = input.nextInt();
        for (int i = 0; i < arry.length - 1; i++) {
            if(k == arry[i]){
                System.out.println("Phan tu "+k+" nam o vi tri "+i);
            }
        }
    }
    
    public boolean kiemTraSoNguyenTo(int n){
        if(n < 2)
            return false;       
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
                return true;            
    }
    
    public static void SortASC(int [] arry){
        for (int i = 0; i < arry.length - 1; i++) {
            int temp = arry[i];
            for (int j = i + 1; j < arry.length; j++) {
                if(arry[i] > arry[j]){
                    arry[i] = arry[j];
                    arry[j] = temp;
                    temp = arry[i];
                }
            }
        }
    }
    
    public static void SortDESC(int [] arry){
        for (int i = 0; i < arry.length - 1; i++) {
            int temp = arry[i];
            for (int j = i + 1; j < arry.length; j++) {
                if(arry[i] < arry[j]){
                    arry[i] = arry[j];
                    arry[j] = temp;
                    temp = arry[i];
                }
            }
        }
    }
    
    
    
    public static void show(int [] arry){
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
    }
}
