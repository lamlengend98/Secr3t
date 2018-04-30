
package baitap3_class;

import java.util.Scanner;


public class Aptech {
    private String hocVien;
    private double diemTongKet;
    private String viPham;
    private int soLanThi;

    public Aptech(String hocVien, double diemTongKet, String viPham, int soLanThi) {
        this.hocVien = hocVien;
        this.diemTongKet = diemTongKet;
        this.viPham = viPham;
        this.soLanThi = soLanThi;
    }

    public Aptech() {
        this.hocVien = "";
        this.diemTongKet = 0;
        this.viPham = "";
        this.soLanThi = 0;
    }

    public String getHocVien() {
        return hocVien;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public String getViPham() {
        return viPham;
    }

    public int getSoLanThi() {
        return soLanThi;
    }

    public void setHocVien(String hocVien) {
        this.hocVien = hocVien;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public void setViPham(String viPham) {
        this.viPham = viPham;
    }

    public void setSoLanThi(int soLanThi) {
        this.soLanThi = soLanThi;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("==================Nhap vao thong tin=================");
        System.out.print("Ban co la hoc vien dang ky khoa hoc HDSE: ");
        hocVien = input.nextLine();
        System.out.print("Nhap diem tong ket: ");
        diemTongKet = Double.parseDouble(input.nextLine());
        System.out.print("Da tung vi pham noi quy: ");
        viPham = input.nextLine();
        System.out.print("Thi lan thu: ");
        soLanThi = Integer.parseInt(input.nextLine());
        
    }
    
    public void showInfo(){
        System.out.println("==================Hien Thi thong tin=================");
        if("Co".equals(hocVien)){
            
                System.out.println("La hoc vien dang ky khoa hoc HDSE \nDiem tong ket: "+diemTongKet+"\n" +viPham+" vi pham noi quy\nThi lan thu "+soLanThi);
              
        } else if("khong".equals(hocVien))
            System.out.println("Ban khong phai hoc vien dang ky khoa hoc HDSE");
            
        
    }
    
    public boolean hocBong(){
        return diemTongKet >= 75 && "Khong".equals(viPham) && soLanThi == 1;
            
    }
}
