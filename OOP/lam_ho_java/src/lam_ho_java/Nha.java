/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lam_ho_java;

/**
 *
 * @author USER
 */
public class Nha extends Dat_Nha {
    private String loaiNha;

    public Nha() {
    }

    public Nha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("Loai nha: ");
        this.setLoaiNha(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", loai nha=" + this.getLoaiNha() + ", tien nha=" + tienNha() + "}";
    }

    
    public double tienNha(){
        if(this.getLoaiNha().equalsIgnoreCase("Biet thu")){
            return this.getDonGia() * this.getDienTich();
        }
        else{
            return this.getDonGia() * this.getDienTich() * 90 / 100;
        }
    }
}
