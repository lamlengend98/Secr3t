/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap12_class;

/**
 *
 * @author USER
 */
public class HinhChuNhat extends HinhBinhHanh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {
    }
    
    @Override
    protected double tinhChuVi(){
        return 2*(chieuDai + chieuRong);
    }
    @Override
    protected double tinhDienTich(){
        return (chieuDai * chieuRong);
    }
}
