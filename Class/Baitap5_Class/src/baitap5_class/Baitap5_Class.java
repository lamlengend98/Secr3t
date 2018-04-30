
package baitap5_class;


public class Baitap5_Class {

    
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(3, 4, 5);
        tg1.TamGiac();
        tg1.chuVivaDienTich();
        
        TamGiac tg2 = new TamGiac();
        tg2.input();
        tg2.TamGiac();
        tg2.chuVivaDienTich();
    }
    
}
