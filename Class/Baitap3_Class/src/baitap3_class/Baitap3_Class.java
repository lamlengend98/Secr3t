
package baitap3_class;


public class Baitap3_Class {

    
    public static void main(String[] args) {
        Aptech s1 = 
                new Aptech("Co", 80, "Khong", 1);
        s1.showInfo();
        if(s1.hocBong())
            System.out.println("Du dieu kien dat hoc bong");
        else
            System.out.println("Khong du dieu kien dat hoc bong");
        
        
        Aptech s2 = new Aptech();
        s2.inputInfo();
        s2.showInfo();        
        s2.hocBong();
        if(s2.hocBong())
            System.out.println("Du dieu kien dat hoc bong");
        else
            System.out.println("Khong du dieu kien dat hoc bong");
        
    }
    
}
