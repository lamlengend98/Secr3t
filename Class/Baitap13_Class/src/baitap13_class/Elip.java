/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap13_class;

/**
 *
 * @author USER
 */
public class Elip extends Point{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Elip(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Elip() {
    }
    
    protected double tinhDienTich(){
        return Math.PI * Math.sqrt(x1*x1 + y1*y1) * Math.sqrt(x2*x2 + y2*y2);
    }
}
