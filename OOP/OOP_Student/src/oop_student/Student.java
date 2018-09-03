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
    private int numOfStudents;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Student(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Student() {
    }

    
    
    
}
