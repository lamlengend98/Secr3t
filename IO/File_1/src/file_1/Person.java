/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Person {
    private String name;
    private String birthday;
    private String address;
    private String gender;
    Scanner input = new Scanner(System.in);

    public Person(String name, String birthday, String address, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void show(){
        System.out.print("Ho ten: ");
        this.setName(input.nextLine());
        System.out.print("Ngay sinh: ");
        this.setBirthday(input.nextLine());
        System.out.print("Dia chi: ");
        this.setAddress(input.nextLine());
        System.out.print("Gioi tinh: ");
        this.setGender(input.nextLine());
    }

    @Override
    public String toString() {
        return "Ten: " + getName() + " $ Ngay sinh: " + getBirthday() + " $ Dia chi: " + getAddress() + " $ Gioi tinh: " + getGender();
    }
    
    
}
