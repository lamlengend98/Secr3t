package baitap14_class;

public class Baitap14_Class {

        public static void main(String[] args) {
            TamGiac tg = new TamGiac(1, 2, 3, 4);
            TamGiacCan tgc = new TamGiacCan(5, 6, 7, 8);
            TamGiacVuong tgv = new TamGiacVuong(10, 20, 30);
            TamGiacDeu tgd = new TamGiacDeu(6, 9);
            
            System.out.println("Chu vi tam giac la: "+tg.tinhChuVi());
            System.out.println("Dien tich tam giac la: "+tg.tinhDienTich());
            
            System.out.println("Chu vi tam giac can la: "+tgc.tinhChuVi());
            System.out.println("Dien tich tam giac can la: "+tgc.tinhDienTich());
            
            System.out.println("Chu vi tam giac vuong la: "+tgv.tinhChuVi());
            System.out.println("Dien tich tam giac vuong la: "+tgv.tinhDienTich());
            
            System.out.println("Chu vi tam giac deu la: "+tgd.tinhChuVi());
            System.out.println("Dien tich tam giac deu la: "+tgd.tinhDienTich());
    }
    
}
