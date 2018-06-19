/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermanager;

import java.util.*;
import java.io.*;

/**
 *
 * @author USER
 */
public class CustomerManager extends Customer {

    private ArrayList<Customer> listCustomer = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public boolean checkW(String words){
        boolean check = words.matches("\\D{1,100}");
        return check;
    }
    
    public boolean checkN(String number){
        boolean check = number.matches("\\d{1,100}");
        return check;
    }
    
    public void add() {
        Customer csm = new Customer();

        do {
            System.out.print("Id: ");
            String id = input.nextLine();
            if (checkN(id)) {
                csm.setId(id);
                break;
            } else {
                System.out.println("ID doesn't include words");
            }

        } while (true);
        
        do{
        System.out.print("Name: ");
        String name = input.nextLine();
        if(checkW(name)){
            csm.setName(name);
            break;
        }
        else{
            System.out.println("Name doesn't include number");
        }
        
        }while(true);
        
        System.out.print("Address: ");
        csm.setAddress(input.nextLine());
        
        do{
        System.out.print("Age: ");
        String age = input.nextLine();
        if(checkN(age)){
            csm.setAge(age);
            break;
        }
        else{
            System.out.println("Age doesn't include words");
        }
        }while(true);

        listCustomer.add(csm);
    }

    public void search(String id) {
        boolean found = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId().equals(id)) {
                System.out.println(listCustomer.get(i));
                found = true;
                break;
            }
            else{
                System.out.println("Customer not found!!!");
                found = false;
            }
        }
    }


    public boolean load(String file) {
        try {
            ObjectInputStream ois
                    = new ObjectInputStream(
                            new FileInputStream(file));
            listCustomer = (ArrayList<Customer>) ois.readObject();
            ois.close();
            for (Customer csm : listCustomer) {
                System.out.println(csm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean save() {
        String file = input.nextLine();
        try {
            ObjectOutputStream oos
                    = new ObjectOutputStream(
                            new FileOutputStream(file));
            oos.writeObject(listCustomer);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
}