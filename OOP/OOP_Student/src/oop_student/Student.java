/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_student;

/**
 *
 * @author USER
 */
public class Student extends Person {
    private String classes;

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + this.getClasses();
    }

    @Override
    public void print() {
        super.print(); 
        System.out.print("Class: ");
        this.setClasses(input.nextLine());
    }
    
}
