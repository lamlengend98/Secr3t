
package baitap5_class;

import java.util.Scanner;



public class TamGiac {
    private int a;
    private int b;
    private int c;
    

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("========Nhập vào 3 cạnh tam giác========");
        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        c = Integer.parseInt(input.nextLine());
    }
    
    
    
    public void TamGiac(){
        TamGiac kt = new TamGiac();
        if(a + b > c && a + c > b && b + c > a){
            if(((a == b && a != c) || (b == a && b != c)) || (b == c && b != a)) 
                System.out.println("Đây là tam giác cân");
            else if(a == b && a == c)
                System.out.println("Đây là tam giác đều");
            else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
                System.out.println("Đây là tam giác vuông");
        }     
        else
            System.out.println("Đây không phải tam giác");
    }
    
    public void chuVivaDienTich(){
        TamGiac kt = new TamGiac();
        int p;
        int nuachuvi;
        double s;
        if(a + b > c && a + c > b && b + c > a){
            p = a + b + c;
            nuachuvi = p/2;
            System.out.println("Chu vi tam giac la: "+p);
            int sqrt = nuachuvi*(nuachuvi - a)*(nuachuvi - b)*(nuachuvi - c);
            s =  Math.sqrt(sqrt);
            System.out.printf("Dien tich tam giac la: %.2f\n",s);
        }
    }
    
    
}
