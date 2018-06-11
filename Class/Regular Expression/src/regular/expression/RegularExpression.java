/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular.expression;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RegularExpression {

//    public static boolean checkpass(String pass) {
//        boolean ck = pass.matches("^.*(?=.{8})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");
//        return ck;
//    }

//    public static boolean checkGmail(String mail){
//        boolean check = mail.matches("^[A-Za-z](\\.?[\\w]){6,30}+@gmail.com$");
//        return check;
//    }
    
    public static boolean checkGmail(String mail){
        boolean check = mail.matches("^(AT|CT)\\w{2,3}$");
        return check;
    }
    
//    public static boolean checkPhoneNumber(String pn){
//        boolean check = pn.matches("\\d{9,10}");
//        return check;
//    }
    
//    public static boolean checkUsername(String username){
//        boolean check = username.matches("^[A-Za-z](\\.?[\\w]){6,16}$");
//        return check;
//    }
    public static void main(String[] args) {
        do {
            String a = new Scanner(System.in).nextLine();
            if (checkGmail(a)) {
                System.out.println(a);
                break;
            } else {
                System.out.println("Error!!");
                
            }
        } while (true);
    }

}
