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
public class Thesis extends Information{
    private String school;
    private String faculity;
    private int year;

    public Thesis(String school, String faculity, int year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.school = school;
        this.faculity = faculity;
        this.year = year;
    }

    public Thesis() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculity() {
        return faculity;
    }

    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input(); 
        System.out.print("School: ");
        setSchool(input.nextLine());
        System.out.print("Faculity: ");
        setFaculity(input.nextLine());
        System.out.print("Year-finishing: ");
        setYear(input.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "\nSchool: " + getSchool() + "\nFaculity: " + getFaculity() + "\nYear-finishing: " + getYear(); 
    }

    
}
