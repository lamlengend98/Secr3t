/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_exc;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StudentManage  {
    private final Student[] listStudent;
    private int index = 0;
    final int size = 10;
    
    public StudentManage () {
        listStudent = new Student[size];
    }
    Scanner input = new Scanner(System.in);
    
    public boolean add(Student stud){
        if( index >= listStudent.length)
            return false;
        listStudent[index] = stud;
        index++;
        return false;
        
    }
    
    public void search(String name){
        boolean found = true;
        for(int i = 0; i < index; i++){
            if(listStudent[i].getName().equals(name))
                System.out.println(listStudent[i].getEmail()+" | "+listStudent[i].getEmail()+" | "+listStudent[i].getAge());
            found = true;
        }
        if(!found)
            System.out.println("Student not found!!");
    }
    
    
    public void list() {
        for (int i = 0; i < index; i++) {
            System.out.println(listStudent[i].getName()+ " | " + listStudent[i].getEmail() + " | " + listStudent[i].getAge());
        }
    }
    
    //True - tăng dần theo tên, False - giảm dần theo tên
    public void list(boolean order){
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = i + 1; j < listStudent.length; j++) {
                if(order){
                if(listStudent[i].getName()
                        .compareTo(listStudent[j].getName()) > 0){
                Student temp = listStudent[i];
                listStudent[i] = listStudent[j];
                listStudent[j] = temp;
                }
            }
            else{
                if(listStudent[i].getName()
                        .compareTo(listStudent[j].getName()) < 0){
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                    
                }
            }
        }
    }
        for(int i = 0 ; i< index; i++){
            System.out.println(listStudent[i].getName()+" | "+listStudent[i].getEmail()+" | "+listStudent[i].getAge());
        }
    }
}

