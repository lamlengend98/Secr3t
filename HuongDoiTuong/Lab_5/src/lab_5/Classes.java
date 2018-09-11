/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Classes {
    private ArrayList<Student> studentList = new ArrayList<>(); //tao mang doi tuong
    private int numOfStd;
    private String name;
    Scanner input = new Scanner(System.in);
    Student student = new Student();
    Person p = new Person();
    Teacher teacher = new Teacher();

    public Classes(){
    }
    
    public Classes(int numOfStd, String name) {
        this.numOfStd = numOfStd;
        this.name = name;
    }

    public int getNumOfStd() {
        return numOfStd;
    }

    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        System.out.print("Class name: ");
        this.setName(input.nextLine());
        System.out.print("Number of student: ");
        this.setNumOfStd(input.nextInt());
        teacher.print();
        for (int i = 0; i < this.getNumOfStd(); i++) {
            System.out.println("Sinh vien thu "+(i+1)+"====");
            p.print();
            System.out.println("");
            Student std = new Student(p.getName(), p.getAddress(), p.getDepartment(), this.getName());
            studentList.add(i, std);
        }
    }
    
    public void show(){
        System.out.println("------Student List------");
        for (int i = 0; i < numOfStd; i++) {
            System.out.println("Sinh vien thu "+(i+1)+"====");
            Student student = studentList.get(i);
            System.out.println(student);
        }
        System.out.println("------Advisor------");
        System.out.println(teacher.toString());
    }
    
}
