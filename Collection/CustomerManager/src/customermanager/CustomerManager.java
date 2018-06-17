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

    public void add() {
        Customer csm = new Customer();

        System.out.print("Id: ");
        csm.setId(Integer.parseInt(input.nextLine()));
        System.out.print("Name: ");
        csm.setName(input.nextLine());
        System.out.print("Address: ");
        csm.setAddress(input.nextLine());
        System.out.print("Age: ");
        csm.setAge(Integer.parseInt(input.nextLine()));

        listCustomer.add(csm);
    }

    public void search(int id) {
        boolean found = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId() == id) {
                System.out.println(listCustomer.get(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Customer not found!!!");
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