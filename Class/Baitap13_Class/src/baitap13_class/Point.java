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
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
    
    protected double tungDo(){
        return y;
    }
    
    protected double hoanhDo(){
        return x;
    }
}
