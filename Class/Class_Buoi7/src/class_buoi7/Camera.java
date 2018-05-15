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
public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
    }

    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public void addNew() {
        String check;
        Scanner sc = new Scanner(System.in);
        super.addNew(); 
        System.out.print("hasWifi: ");
        do {
            check = sc.nextLine();
            if(check.equalsIgnoreCase("yes")) {
                this.setHasWifi(true);
                break;
            }
            if(check.equalsIgnoreCase("no")) {
                this.setHasWifi(false);
                break;
            }
        }while(!check.equalsIgnoreCase("yes") || !check.equalsIgnoreCase("no"));
    }
    
    @Override
    public String toString() {
        if(this.hasWifi) {
            return super.toString() + "\t\t" + "yes";
        } else {
            return super.toString() + "\t\t" + "no";
        }
    }
}
