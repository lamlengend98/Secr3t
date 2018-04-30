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
public class TamGiacDeu extends TamGiacCan{
    private double canh;
    private double duongcao;

    public TamGiacDeu(double canh, double duongcao) {
        this.canh = canh;
        this.duongcao = duongcao;
    }

    public TamGiacDeu() {
    }
   
    
    @Override
    protected double tinhChuVi(){
        return (canh*3);
    }
    
    @Override
    protected double tinhDienTich(){
        return (canh * duongcao)/2;
    }
}
