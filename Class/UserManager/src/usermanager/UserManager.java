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

    public void createUser() {
        User u = new User();
        do {
            System.out.print("Input username: ");
            String user = input.nextLine();
            if (checkUsername(user)) {
                u.setUsername(user);
                break;
            } else {
                System.out.println("Username co tu 6 - 16 ky tu bao gom chu, so va ky tu '.' , bat dau la chu va ket thuc la chu hoac so");
            }

        } while (true);

        do {
            System.out.print("Input password: ");
            String pass = input.nextLine();
            if (checkPass(pass)) {
                u.setPassword(pass);
                break;
            } else {
                System.out.println("Password co nhieu hon 8 ky tu, bao gom tat ca ky tu ngoai tru ky tu dac biet");
            }

        } while (true);

        do {
            System.out.print("input gmail: ");
            String mail = input.nextLine();
            if (checkGmail(mail)) {
                u.setEmail(mail);
                break;
            } else {
                System.out.println("Gmail co tu 6 - 30 ky tu bao gom chu, so va ky tu '.' , bat dau la chu va ket thuc la chu hoac so");
            }

        } while (true);

        do {
            System.out.print("Input phone number: ");
            String pn = input.nextLine();
            if (checkPhoneNumber(pn)) {
                u.setPhone(pn);
                break;
            } else {
                System.out.println("Phone number bat dau la 84, dang sau la 9 hoac 10 chu so");
            }

        } while (true);

        this.list[index] = u;
        index++;
    }

    public void listUser() {
        for (int i = 0; i < index; i++) {
            System.out.println("Username: " + list[i].getUsername());
            System.out.println("Password: " + list[i].getPassword());
            System.out.println("Phone number: " + list[i].getPhone());
            System.out.println("Email: " + list[i].getEmail());
            System.out.println("");
        }
    }

    public void searchUser(String name) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (list[i].getUsername().equals(name)) {

                System.out.println("Username: " + list[i].getUsername());
                System.out.println("Password: " + list[i].getPassword());
                System.out.println("Phone number: " + list[i].getPhone());
                System.out.println("Email: " + list[i].getEmail());
                found = true;
            }
        }
        if (!found) {
            System.out.println("User not found!!");
        }
    }

    public void updateUser() {
        User u = new User();
        System.out.print("Username: ");
        String name = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();

        boolean flag = false;
        for (int i = 0; i < index; i++) {
            if (list[i].getUsername().equals(name) && list[i].getPassword().equals(pass)) {
                System.out.println("Username: " + list[i].getUsername());
                System.out.println("Password: " + list[i].getPassword());
                System.out.println("Phone number: " + list[i].getPhone());
                System.out.println("Email: " + list[i].getEmail());
                System.out.println("-----------------------");
                System.out.print("Update email: ");
                list[i].setEmail(input.nextLine());
                System.out.print("Update phone number: ");
                list[i].setPhone(input.nextLine());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Username or password is wrong!!");
        }
    }

    public boolean checkPass(String pass) {
        boolean check = pass.matches("^.*(?=.{8})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");
        return check;
    }

    public static boolean checkUsername(String username) {
        boolean check = username.matches("^[A-Za-z](\\.?[\\w]){6,16}$");
        return check;
    }

    public static boolean checkGmail(String mail) {
        boolean check = mail.matches("^[A-Za-z](\\.?[\\w]){6,30}+@gmail.com$");
        return check;
    }

    public static boolean checkPhoneNumber(String pn) {
        boolean check = pn.matches("84\\d{9,10}");
        return check;
    }
}
