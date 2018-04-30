
package baitap4_class;

import java.util.Scanner;


public class SoNguyenTo {
    private int x;
    private int a;

    public SoNguyenTo(int x, int a) {
        this.x = x;
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    

    public SoNguyenTo() {
    }

    public int getX() {
        return x;
    }

    

    public void setX(int x) {
        this.x = x;
    }

    
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========Nhap vao so nguyen to==========");
        System.out.print("Nhap vao so bat ky: ");
        x = Integer.parseInt(input.nextLine());
    }
    
    public boolean isSoNguyenTo(int x){
        if(x < 2)
            return false;       
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0)
                return false;
        }
                return true;            
    }
       
    public void SoNguyento(){
        System.out.println("=========Hien thi=========");
        int a = 0;
        SoNguyenTo kt = new SoNguyenTo();
        if(kt.isSoNguyenTo(x)){
            a = x;
            System.out.printf("So %d la so nguyen to",a);
            System.out.println("\nSo nguyen to tiep theo cua "+a+" là "+timSoNguyenToTiepTheo());
        } else
            System.out.printf("%d khong phai so nguyen to",x);
    }
        
    
    public int timSoNguyenToTiepTheo(){
        
        while(true){
            boolean next = true;
            x = x + 1;
            for(int i = 2; i <= Math.sqrt(x);i++){
                if(x % i == 0){
                    next = false;
                    
                    break;
                }
            }
            if(next){
                return x;
                
            }
        }        
    }
    
    
}
    
    
    

