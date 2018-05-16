/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_buoi7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }
    

    public int getSim() {
        return sim;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    @Override
    public void addNew() {
        super.addNew(); 
        System.out.print("hasCamera: ");
        String check;
        Scanner sc = new Scanner(System.in);        
        do {
            check = sc.nextLine();
            if(check.equalsIgnoreCase("yes")) {
                this.setHasCamera(true); 
                break;
            }
            if(check.equalsIgnoreCase("no")) {
                this.setHasCamera(false);
                break;
            }
        }while(!check.equalsIgnoreCase("yes") || !check.equalsIgnoreCase("no"));
    
        System.out.print("Input sim code: ");
        this.setSim(Integer.parseInt(sc.nextLine()));
    }
    @Override
    public String toString() {
        if(this.hasCamera) {
            return super.toString() + "\t\t" + "yes\t\t"+this.getSim();
        } else {
            return super.toString() + "\t\t" + "no\t\t"+this.getSim();
        }
        
    }
    
}
