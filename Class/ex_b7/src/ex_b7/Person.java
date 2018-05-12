/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_b7;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Person {
    private String name;
    private Date birth;

    public Person() {
    }

    public Person(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }
 
    public void getDetails(){
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee birthday: "+this.birth);
    }
}
