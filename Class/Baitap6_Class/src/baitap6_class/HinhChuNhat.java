
package baitap6_class;

import java.util.Scanner;


public class HinhChuNhat {
    private int a;
    private int b;

    public HinhChuNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public HinhChuNhat() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("========Nhập độ dài 2 cạnh hình chữ nhật========");
        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
    }
    
    public void chuVi(){
        int p;
        p = (a + b)*2;
        System.out.println("Chu vi hình chữ nhật là: "+p);
    }
    
    public void dienTich(){
        int s;
        s = a*b;
        System.out.println("Diện tích hình chữ nhật là: "+s);
    }
}
