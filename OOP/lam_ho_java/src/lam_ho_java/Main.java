package lam_ho_java;

import java.util.Scanner;

/**
 *
 * @author Lam
 */
public class Main {

    public static void main(String[] args) {
        Dat d = new Dat();
        Nha n = new Nha();
        System.out.println("1. Nha");
        System.out.println("2. Dat");
        System.out.println("3. Ket thuc");
        System.out.print("Chon: ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        
        do{
            switch(choice){
                case 1:
                    n.input();
                    System.out.println(n.toString());
                    break;
                case 2:
                    d.input();
                    System.out.println(d.toString());
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Loi!! Nhap lai!!");
            }
        }while(true);
    }
    
}
