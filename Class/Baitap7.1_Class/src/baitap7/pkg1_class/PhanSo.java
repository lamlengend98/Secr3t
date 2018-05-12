/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap7.pkg1_class;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PhanSo {
    private int tu1;
    private int mau1;
    private int tu2;
    private int mau2;

    public PhanSo(int tu1, int mau1, int tu2, int mau2) {
        this.tu1 = tu1;
        this.mau1 = mau1;
        this.tu2 = tu2;
        this.mau2 = mau2;
    }

    public PhanSo() {
    }

    public int getTu1() {
        return tu1;
    }

    public int getMau1() {
        return mau1;
    }

    public int getTu2() {
        return tu2;
    }

    public int getMau2() {
        return mau2;
    }

    public void setTu1(int tu1) {
        this.tu1 = tu1;
    }

    public void setMau1(int mau1) {
        this.mau1 = mau1;
    }

    public void setTu2(int tu2) {
        this.tu2 = tu2;
    }

    public void setMau2(int mau2) {
        this.mau2 = mau2;
    }
    
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("=========Nhập vào phân số=========");
        System.out.println("Phân số thứ 1: ");
        tu1 = Integer.parseInt(input.nextLine());
        mau1 = Integer.parseInt(input.nextLine());
        System.out.println("Phân số thứ 2: ");
        tu2 = Integer.parseInt(input.nextLine());
        mau2 = Integer.parseInt(input.nextLine());
    }
    
    public int UCLN(int tu, int mau){
        int du;
 
        while(mau != 0) {
            du = tu%mau;;
            tu = mau;
            mau = du;
        }
        return tu;
    
    }
    
    
    
    public void print(){
        
        if(mau1 == 0)
            System.out.println("Thứ 1 không phải phân số");
        else {
            if(tu1 == 0)
                System.out.printf("Phân số thứ 1 vừa nhập vào là: 0/%d = 0\n",mau1);
            else
                System.out.printf("Phân số thứ 1 vừa nhập vào là: %d/%d\n",tu1,mau1);
        }
        
        if(mau2 == 0)
            System.out.println("Thứ 2 không phải phân số");
        else {
            if(tu2 == 0)
                System.out.printf("Phân số thứ 2 vừa nhập vào là: 0/%d = 0\n",mau2);
            else
                System.out.printf("Phân số thứ 2 vừa nhập vào là: %d/%d\n",tu2,mau2);
        }
    }
    
    public void rutGon(){       
        int ucln1 = UCLN(tu1, mau1);
        int ucln2 = UCLN(tu2, mau2);
        System.out.printf("Rút gọn phân số thứ 1: %d/%d\n",tu1/ucln1,mau1/ucln1);
        System.out.printf("Rút gọn phân số thứ 2: %d/%d\n",tu2/ucln2,mau2/ucln2);
    }
    
    public void mul(){
        int tichtu = tu1*tu2;
        int tichmau = mau1*mau2;
        
        System.out.printf("Tích 2 phân số là: %d/%d\n",tichtu/UCLN(tichtu, tichmau),tichmau/UCLN(tichtu, tichmau));
    }
    
    public void div(){
        int thuongTu = tu1*mau2;
        int thuongMau = tu2*mau1;
        System.out.printf("Thương 2 phân số là: %d/%d\n",thuongTu/UCLN(thuongTu, thuongMau),thuongMau/UCLN(thuongTu, thuongMau));
    }
    
    public void add(){        
        int tongMau = (mau1*mau2)/UCLN(mau1,mau2);
        int n1 = tongMau/mau1;
        int n2 = tongMau/mau2;
        int tongTu = tu1*n1 + tu2*n2;
        System.out.printf("Tổng 2 phân số là: %d/%d\n",tongTu/UCLN(tongTu,tongMau),tongMau/UCLN(tongTu, tongMau));
        
    }
    
    public void sub(){
        int hieuMau = (mau1*mau2)/UCLN(mau1,mau2);
        int h1 = hieuMau/mau1;
        int h2 = hieuMau/mau2;
        int hieuTu = tu1*h1 - tu2*h2;
        System.out.printf("Hiệu 2 phân số là: %d/%d\n",hieuTu/UCLN(hieuTu,hieuMau),hieuMau/UCLN(hieuTu, hieuMau));
        
    }
}

