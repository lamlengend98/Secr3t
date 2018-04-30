package baitap8_class;

import java.util.Scanner;

public class SoPhuc {
    private int a;
    private int b;
    private int c;
    private int d;

    public SoPhuc(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public SoPhuc() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("=========Nhập vào số phức=========");
        System.out.println("Nhập vào số phức thứ 1: ");
        System.out.print("Nhập phần thực: ");       
        a = Integer.parseInt(input.nextLine());
        System.out.print("Nhập phần ảo: ");
        b = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào số phức thứ 2: ");
        System.out.print("Nhập phần thực: ");
        c = Integer.parseInt(input.nextLine());
        System.out.print("Nhập phần ảo: ");
        d = Integer.parseInt(input.nextLine());
    }
    
    public void print(){
        System.out.println("=======In ra số phức======");
        if(b < 0)
            System.out.printf("Số phức thứ 1 vừa nhập là: %d - %di",a,b);
        else
            System.out.printf("Số phức thứ 1 vừa nhập là: %d + %di",a,b);
        if(d < 0)
            System.out.printf("\nSố phức thứ 2 vừa nhập là: %d - %di",c,d);
        else
            System.out.printf("\nSố phức thứ 2 vừa nhập là: %d + %di",c,d);
    }
    
    public void add(){
        
            System.out.printf("\nCộng 2 số phức: %d + %di",a+c,b+d);
    }
    
    public void sub(){
            System.out.printf("\nTrừ 2 số phức: %d + %di",a-c,b-d);
        
    }
    
    public void mul(){
            System.out.printf("\nNhân 2 số phức: %d + %di",a*c - b*d,a*d + b*c);
        
    }
    
    public String div(){
            
            return "\nChia 2 số phức: "+(a*c + b*d)/(c*c + d*d)+" +"+(b*c - a*d)/(c*c + d*d)+"i\n";
        
    }
}
