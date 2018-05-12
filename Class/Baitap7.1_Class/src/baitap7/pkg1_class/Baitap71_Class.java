
package baitap7.pkg1_class;


public class Baitap71_Class {

    
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3, 4, 5, 6);
        
        ps1.print();
        ps1.rutGon();
        ps1.add();
        ps1.sub();
        ps1.mul();
        ps1.div();
        
        
        PhanSo ps2 = new PhanSo();
        ps2.input();
        ps2.print();
        ps2.rutGon();
        ps2.add();
        ps2.sub();
        ps2.mul();
        ps2.div();
    }
    
}
