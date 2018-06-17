/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_collection_1;

import java.util.*;

public class UserManager {

    private Scanner input = new Scanner(System.in);
    private ArrayList<User> listUser = new ArrayList<>();

    public void createUser() {
        User u = new User();
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input username: ");
            String user = input.nextLine();
            if (checkUsername(user)) {
                u.setUserName(user);
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
        listUser.add(u);
    }

    public void printUser() {
        for (int i = 0; i < listUser.size(); i++) {
            System.out.println(listUser.get(i));
        }
    }

    public void searchUser(String name) {
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equalsIgnoreCase(name)) {
                System.out.println(listUser.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("User not found!!");
        }
    }

    public void updateUser() {
        boolean flag = false;
        System.out.print("Username: ");
        String un = input.nextLine();
        System.out.print("Password: ");
        System.out.println("");
        String pw = input.nextLine();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equalsIgnoreCase(un) && listUser.get(i).getPassword().equalsIgnoreCase(pw)) {
                System.out.println(listUser.get(i));
                System.out.println("================================");
                System.out.print("Update Username: ");
                listUser.get(i).setUserName(input.nextLine());
                System.out.print("Update Password: ");
                listUser.get(i).setPassword(input.nextLine());
                System.out.print("Update Email: ");
                listUser.get(i).setEmail(input.nextLine());
                System.out.print("Update Phone: ");
                listUser.get(i).setPhone(input.nextLine());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("User not found!!");
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
