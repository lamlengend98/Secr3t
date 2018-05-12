/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_b7;

/**
 *
 * @author USER
 */
public class Employee extends Person{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Salary: "+this.salary);
    }
}
