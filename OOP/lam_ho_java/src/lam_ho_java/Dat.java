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
public class Dat extends Dat_Nha {
    private String loaiDat;
    private double tienDat;

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public Dat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public Dat() {
        
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Loai dat: ");
        this.setLoaiDat(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", loai dat=" + this.getLoaiDat() + ", tien dat=" + Dat() + "}"; 
    }
    
    public double Dat()
    {
        if(this.getLoaiDat().equalsIgnoreCase("A")){
            return this.getDienTich() * this.getDonGia() * 1.5;
        }
        else{
            return this.getDienTich() * this.getDonGia();
        }
    }
}
