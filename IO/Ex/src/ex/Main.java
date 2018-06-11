package ex;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        StudentManager s = new StudentManager();

        do {
            System.out.println("================================");
            System.out.println("1. Add a student.");
            System.out.println("2. List student.");
            System.out.println("3. Search student.");
            System.out.println("4. Delete student.");
            System.out.println("5. Exit.");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("================================");
            switch (choice) {
                case 1:
                    s.add();
                    break;
                case 2:
                    s.show();
                    
                    break;
                case 3:
                    System.out.print("Student's name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("");
                    s.search(name);
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error!! Let's choice!!");
            }
        } while (true);

    }

}
