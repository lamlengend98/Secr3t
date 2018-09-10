/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

/**
 *
 * @author USER
 */
public class Student extends Person{
    private String classes;

    public Student(String classes) {
        this.classes = classes;
    }

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public void print() {
        System.out.println("======Student=======");
        super.print(); 
        System.out.print("Class: ");
        this.setClasses(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nClass: "+this.getClasses(); 
    }
    
}
