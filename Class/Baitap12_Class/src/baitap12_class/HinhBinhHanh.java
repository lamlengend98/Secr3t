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
public class HinhBinhHanh extends DaGiac {
    private double canhKe1;
    private double canhKe2;
    private double chieuCaoCanhKe1;

    public HinhBinhHanh(double canhKe1, double canhKe2, double chieuCaoCanhKe1) {
        this.canhKe1 = canhKe1;
        this.canhKe2 = canhKe2;
        this.chieuCaoCanhKe1 = chieuCaoCanhKe1;
    }
    
    public HinhBinhHanh(){
    }
    @Override
        protected double tinhChuVi(){
            return 2*(canhKe1 + canhKe2);
        }
    @Override
        protected double tinhDienTich(){
            return (canhKe1 * chieuCaoCanhKe1);
        }
    }
