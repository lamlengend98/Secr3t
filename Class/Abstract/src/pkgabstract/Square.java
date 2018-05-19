/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author USER
 */
public class Square extends Shape{
    private double width;

    public Square() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    

    @Override
    public double calArea() {
        return this.width * this.width;
    }
    
}
