/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NewClass {
    private Classes[] studentList;
    private int index = 0;
    Classes cl = new Classes();
    Student std = new Student();
    Teacher tch = new Teacher();

    public NewClass(Classes[] studentList) {
        this.studentList = new Classes[index];
    }
    
    public void inputList(){
        System.out.print("Class's name: ");
        cl.setClassName(new Scanner(System.in).nextLine());
        System.out.print("Number of Students: ");
        std.setNumOfStudents(Integer.parseInt(new Scanner(System.in).nextLine()));
        for (int i = 0; i < std.getNumOfStudents(); i++) {
            System.out.println("======Student======");
            System.out.printf("Hoc sinh thu %d",i+1);
            System.out.println("");
            std.print();
            

        }
        System.out.println("======Advisor======");
            tch.print();
            this.studentList[index++] = tch;
    }
    
    public void print(String className){
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getClassName().equalsIgnoreCase(className)){
                System.out.println(studentList.get(i));
            }
        }
    }
    
}
