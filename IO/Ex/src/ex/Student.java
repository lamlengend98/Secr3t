/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Student implements Serializable{
    private String name;
    private String cla;
    private String age;
    private String id; 
    private String mark;

    public Student() {
    }

    public Student(String name, String cla, String age, String id, String mark) {
        this.name = name;
        this.cla = cla;
        this.age = age;
        this.id = id;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", cla=" + cla + ", age=" + age + ", id=" + id + ", mark=" + mark + '}';
    }
    
    public boolean checkID(String id){
        boolean check = id.matches("HV\\d{3}");
        return check;
    }
    
    public boolean checkName(String name){
        boolean check = name.matches("\\D{1,100}");
        return check;
    }
    
    public boolean checkAge(String age){
        boolean check = age.matches("\\d{2}");
        return check;
    }
    
    public boolean checkMark(String mark){
        boolean check = mark.matches("\\d+\\.\\d");
        return check;
    }
    
    public boolean checkClass(String cla){
        boolean check = cla.matches("^(AT|CT)\\w{2,3}$");
        return check;
    }
    
}
