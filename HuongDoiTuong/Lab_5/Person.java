/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Person {
    private String name;
    private String address;
    private String department;
    Scanner input = new Scanner(System.in);

    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void print(){
        System.out.print("Name: ");
        this.setName(input.nextLine());
        System.out.print("Address: ");
        this.setAddress(input.nextLine());
        System.out.print("Department: ");
        this.setDepartment(input.nextLine());
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAddress: " + this.getAddress() + "\nDepartment: " + this.getDepartment();
    }
    
    
}
