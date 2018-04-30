
package baitap6_class;

public class Baitap6_Class {

        public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(3, 4);
        h1.chuVi();
        h1.dienTich();
        
        
        HinhChuNhat h2 = new HinhChuNhat();
        h2.input();
        h2.chuVi();
        h2.dienTich();
    }
    
}
