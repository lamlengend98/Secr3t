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
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }
    
    @Override
    protected double tinhChuVi(){
        return (4 * canh);
    }
    
    @Override
    protected double tinhDienTich(){
        return (canh*canh);
    }
}
