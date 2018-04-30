package baitap10_class;

import java.util.Scanner;

public class DaThuc {
    private int n;
    private int m;
    private double [] a;
    private double [] b;

    public DaThuc(int n, int m) {
        this.m = m;
        this.n = n;
        a = new double[n];
        b = new double[m];
    }

   
    public DaThuc(double[] a, double [] b) {
        this.n = a.length;
        this.a = new double[n];
        this.b = new double[m];
        for(int i = 0; i < a.length; i++){
            this.a[i]  = a[i];
        }
        
        for(int j = 0; j < b.length; j++){
            this.b[j] = b[j];
        }
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getA() {
        return a;
    }

    public DaThuc() {
        n = 0;
        m = 0;
        a = null;
        b = null;
    }

    public int getN() {
        return n;
    }
    
    public void setN(int n) {
        this.n = n;
    }

    public void input1(){
        
        System.out.println("=========Nhập vào đa thức=========");
        Scanner input = new Scanner(System.in);
        do{
        System.out.print("Nhập vào số bậc cao nhất của đa thứ 1: ");
        n = Integer.parseInt(input.nextLine());
        
        if(n < 1)
                System.out.println("Mời bạn nhập lại");
        }while(n < 1);
        a = new double[n+1];
        
        for(int i = 0; i < n + 1; i++){           
            System.out.printf("Nhập hệ số bậc thứ %d của đa thứ 1: ",i);
            a[i] = input.nextDouble();            
        }
    }
    
    public void input2(){
        System.out.println("=========Nhập vào đa thức=========");
        Scanner input = new Scanner(System.in);
        
        do{
        System.out.print("Nhập vào số bậc cao nhất của đa thứ 2: ");
        m = Integer.parseInt(input.nextLine());
        
        if(m < 1)
                System.out.println("Mời bạn nhập lại");
        }while(m < 1);
        
        b = new double[m+1];
        
        for(int j = 0; j < m + 1; j++){           
            System.out.printf("Nhập hệ số bậc thứ %d của đa thứ 2: ",j);
            b[j] = input.nextDouble();            
        }
    }
    
    public void print1(){
        
        System.out.print("Đa thức thứ 1 vừa nhập vào là: ");                
        for(int i = 0; i < n; i++){
                System.out.print(a[i]+" * x^"+i+" + ");
        }
        System.out.println(a[n]+" * x^"+n);
    }
    
    public void print2(){
        System.out.print("Đa thức thứ 2 vừa nhập vào là: ");               
        for(int j = 0; j < m; j++){
                System.out.print(b[j]+" * x^"+j+" + ");
        }
        System.out.println(b[m]+" * x^"+m);
    }
    
    public void add(){
        int sum = 0;
        double [] c = new double[sum];
        for(int i = 0; i < n; i++){
            c[sum] = a[i];
            for(int j = 0; j < m; j++){
                c[sum] += b[j];
            }
            System.out.println(c[sum]+" *x^"+i);
        }
    }
}
