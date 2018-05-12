/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UserManager {
    private final User[] list;
    private final int size = 10;
    int index = 0;    
    Scanner input = new Scanner(System.in);

    public UserManager() {
        this.list = new User[size];
        this.input = new Scanner(System.in);
    }
    
    public void createUser(){
        User u = new User();
        
        System.out.print("Input username: ");
        u.setUsername(input.nextLine());
        System.out.print("Input password: ");
        u.setPassword(input.nextLine());
        System.out.print("input email: ");
        u.setEmail(input.nextLine());
        System.out.print("Input phone number: ");
        u.setPhone(input.nextLine());
        
        this.list[index] = u;
        index++;
    }
    
    public void listUser(){
        for(int i = 0; i < index; i++){
            System.out.println("Username: "+list[i].getUsername());
            System.out.println("Password: "+list[i].getPassword());
            System.out.println("Phone number: "+list[i].getPhone());
            System.out.println("Email: "+list[i].getEmail());
            System.out.println("");
        }
    }
    
    public void searchUser(String name){
        boolean found = false;
        for(int i = 0; i < index; i++){
            if(list[i].getUsername().equals(name)){
                
                System.out.println("Username: "+list[i].getUsername());
                System.out.println("Password: "+list[i].getPassword());
                System.out.println("Phone number: "+list[i].getPhone());
                System.out.println("Email: "+list[i].getEmail());
                found = true;
            }
        }
        if(!found){
            System.out.println("User not found!!");
        }
    }
    
    public void updateUser(){
        User u = new User();
        System.out.print("Username: ");
        String name = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        
        boolean flag = false;
        for(int i = 0; i < index ; i++){
            if(list[i].getUsername().equals(name) && list[i].getPassword().equals(pass)){
                System.out.println("Username: "+list[i].getUsername());
                System.out.println("Password: "+list[i].getPassword());
                System.out.println("Phone number: "+list[i].getPhone());
                System.out.println("Email: "+list[i].getEmail());
                System.out.println("-----------------------");
                System.out.print("Update email: ");
                list[i].setEmail(input.nextLine());
                System.out.print("Update phone number: ");
                list[i].setPhone(input.nextLine());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Username or password is wrong!!");
        }
    }
}
