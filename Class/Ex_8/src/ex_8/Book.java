/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Book extends Information{
    private String punisher;
    private String version;
    private int year;

    public Book(String punisher, String version, int year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.punisher = punisher;
        this.version = version;
        this.year = year;
    }

    public Book() {
    }

    public String getPunisher() {
        return punisher;
    }

    public void setPunisher(String punisher) {
        this.punisher = punisher;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        System.out.print("Punisher: ");
        setPunisher(input.nextLine());
        System.out.print("Version: ");
        setVersion(input.nextLine());
        System.out.print("Year-punishing: ");
        setYear(input.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "\nPunisher: " + getPunisher() + "\nVersion: " + getVersion()+ "\nYear-punishing: " + getYear(); 
    }

   
    
}
