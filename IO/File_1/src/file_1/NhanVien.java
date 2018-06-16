/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_1;

/**
 *
 * @author USER
 */
public class NhanVien extends Person {

    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private double luong;
    

    
    public NhanVien(String phongBan, double heSoLuong, int thamNien, double luong) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double luongThuc() {
        return this.getLuong() * this.getHeSoLuong() * (1 + (this.getThamNien() / 100));
    }

    @Override
    public void show() {        
        super.show();
        System.out.print("Phong Ban: ");
        this.setPhongBan(input.nextLine());
        System.out.print("He so luong: ");
        this.setHeSoLuong(input.nextDouble());
        System.out.print("Tham nien: ");
        this.setThamNien(input.nextInt());
        System.out.print("Luong co ban: ");
        this.setLuong(input.nextDouble());
        
    }

    @Override
    public String toString() {
        return super.toString() + " $ Phong ban: " + getPhongBan() + " $ He so luong: " + getHeSoLuong()
                + " $ Tham nien: " + getThamNien() + " $ Luong co ban: " + getLuong() + " $ Luong thuc: " + luongThuc();
    }

}
