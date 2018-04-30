
package baitap_class;


public class Baitap_Class {

    
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyen Van A", 25, "Ha Noi", 3000000, 200);
        System.out.println(nv1.printinfo());
        System.out.println(nv1.tinhThuong());
        System.out.println("=============================");
        
        
        NhanVien nv2 = new NhanVien();
        System.out.println(nv2.inputinfo());
        System.out.println(nv2.printinfo());
        System.out.println(nv2.tinhThuong());
        System.out.println("====================");
        
    }
    
}
