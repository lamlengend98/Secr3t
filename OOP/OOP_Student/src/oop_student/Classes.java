/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_student;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Classes {
    private String className;
    private int numOfStudents;
    private Person[] studentList;
    int index = 0;
    int size = 10;
    int choice;
    Scanner input = new Scanner(System.in);
    Student std = new Student();
    Teacher tch = new Teacher();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    
    public Classes(){
        this.studentList = new Person[size];
        this.input = new Scanner(System.in);
    }
    
    public void inputList(){
        System.out.print("Class's name: ");
        this.setClassName(input.nextLine());
        System.out.print("Number of Students: ");
        this.setNumOfStudents(input.nextInt());
        for (int i = 0; i < this.getNumOfStudents(); i++) {
            System.out.println("======Student======");
            std.print();
        }
        System.out.println("======Advisor======");
            tch.print();
        this.studentList[index++] = std;
        this.studentList[index++] = tch;
    }
    
    public void printList(){
        System.out.println("=======Student======");
        System.out.println("Name\t\tAddress\t\tDepartment\t\tClass");
        for (int i = 0; i < index; i++) {
            System.out.println(studentList[i].toString());
        }
        System.out.println("========Advisor======");
        System.out.println("Name\t\tAddress\t\tDepartment\t\tRank");
        System.out.println(tch.toString());
    }
}
