/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap14_class;

/**
 *
 * @author USER
 */
public class TamGiacCan extends TamGiac {
    private double canh1;
    private double canh2;
    private double canhDay;
    private double duongCao;

    public TamGiacCan(double canh1, double canh2, double canhDay, double duongCao) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canhDay = canhDay;
        this.duongCao = duongCao;
    }

    public TamGiacCan() {
    }
    
    @Override
    protected double tinhChuVi(){
        return (canh1 + canh2 + canhDay);
    }
    
    @Override
    protected double tinhDienTich(){
        return (canhDay * duongCao)/2;
    }
}
