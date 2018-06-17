/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StudentManager extends Student {

    private Student[] studentList;
    private int size = 10;
     int index = 0;
    Scanner input = new Scanner(System.in);
    SaveStudent ss = new SaveStudent();

    public StudentManager() {
        this.studentList = new Student[size];
        this.input = new Scanner(System.in);
    }

    public void add() {
        Student student = new Student();
        System.out.println("========Add a student========");
        do {
            System.out.print("ID: ");
            String id = input.nextLine();
            if (checkID(id)) {
                student.setId(id);
                break;
            } else {
                System.out.println("ID bat dau bang HV va ket thuc la 3 chu so!!");
            }
        } while (true);

        do {
            System.out.print("Name: ");
            String name = input.nextLine();
            if (checkName(name)) {
                student.setName(name);
                break;
            } else {
                System.out.println("Name khong bao gom so!!");
            }
        } while (true);

        do {
            System.out.print("Age: ");
            String age = input.nextLine();
            if (checkAge(age)) {
                student.setAge(age);
                break;
            } else {
                System.out.println("Age khong bao gom chu!!");
            }
        } while (true);

        do {
            System.out.print("Class: ");
            String cla = input.nextLine();
            if (checkClass(cla)) {
                student.setCla(cla);
                break;
            } else {
                System.out.println("Vui long nhap dung ten lop!!");
            }
        } while (true);

        do {
            System.out.print("Mark: ");
            String mark = input.nextLine();
            if (checkMark(mark)) {
                student.setMark(mark);
                break;
            } else {
                System.out.println("Vui long nhap dung dinh dang!!");
            }
        } while (true);
        this.studentList[index] = student;
        index++;
        ss.write(studentList);
           
    }

    public void show(){
        System.out.println("=========List of Student=======");
        for (int i = 0; i < index; i++) {
            System.out.println(studentList[i]);
        }
    }
    
    public void search(String name){
        boolean find = false;
        for (int i = 0; i < index; i++) {
            if(studentList[i].getName().equalsIgnoreCase(name)){
                System.out.println(studentList[i]);
                find = true;
            }
        }
        if(!find) System.out.println("Student not found!!");
    }
    
    

}
