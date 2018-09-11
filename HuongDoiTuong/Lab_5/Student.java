/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author USER
 */
public class Student extends Person{
    private String classes;

    public Student( String name, String address, String department, String classes) {
        super(name, address, department);
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
