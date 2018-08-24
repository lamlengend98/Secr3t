/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lam_ho_java;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Dat_Nha {
    private String diaChi;
    private String ngayGiaoDich;
    private double donGia;
    private double dienTich;
    Scanner input = new Scanner(System.in);

    public Dat_Nha(String diaChi, String ngayGiaoDich, double donGia, double dienTich) {
        this.diaChi = diaChi;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    
    public String getDiaChi() {
        return diaChi;
    }

    public Dat_Nha() {
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    public void input(){
        System.out.print("Dia chi: ");
        this.setDiaChi(input.nextLine());
        System.out.print("Ngay giao dich: ");
        this.setNgayGiaoDich(input.nextLine());
        System.out.print("Don gia: ");
        this.setDonGia(Double.parseDouble(input.nextLine()));
        System.out.print("Dien tich: ");
        this.setDienTich(Double.parseDouble(input.nextLine()));
        }

    @Override
    public String toString() {
        return "Dat_Nha{" + "diaChi=" + this.getDiaChi() + ", ngayGiaoDich=" + this.getNgayGiaoDich() + 
                ", donGia=" + this.getDonGia() + ", dienTich=" + this.getDienTich();
    }
    
}
