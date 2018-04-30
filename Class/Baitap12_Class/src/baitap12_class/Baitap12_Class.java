
package baitap12_class;


public class Baitap12_Class {

    
    public static void main(String[] args) {
        HinhBinhHanh hbh = new HinhBinhHanh(4, 3, 3);
        HinhChuNhat hcn = new HinhChuNhat(5, 6);
        HinhVuong hv = new HinhVuong(8);
        
        System.out.println("Chu vi hinh binh hanh la: "+hbh.tinhChuVi());
        System.out.println("Dien tich hinh binh hanh la: "+hbh.tinhDienTich());
        
        System.out.println("Chu vi hinh chu nhat la: "+hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat la: "+hcn.tinhDienTich());
        
        System.out.println("Chu vi hinh vuong la: "+hv.tinhChuVi());
        System.out.println("Dien tih hinh vuong la: "+hv.tinhDienTich());
    }
    
}
