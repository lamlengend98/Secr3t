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
public class Circle extends Elip {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle() {
    }
    
    @Override
    protected double tinhDienTich(){
        return Math.PI * (x*x + y*y);
    }
}
