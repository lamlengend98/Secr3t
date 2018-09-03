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
public class Classes extends Person {
    private String className;
    
    
    
//    
//    public void printList(String className){
//        System.out.println("Number of Students: " + this.getNumOfStudents());
//        boolean flag = true;
//        for (int i = 0; i < studentList.length; i++) {
//            if(studentList[i].get)
//        }
//    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Classes(String className) {
        this.className = className;
    }

    public Classes() {
    }
}
