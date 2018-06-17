package customermanager;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CustomerManager csm = new CustomerManager();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("====Menu====");
            System.out.println("1. Load data.");
            System.out.println("2. Add new.");
            System.out.println("3. Search.");
            System.out.println("4. Save.");
            System.out.println("5. Exit.");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());
            System.out.println("============");

            switch (choice) {
                case 1:
                    csm.load(input.nextLine());
                    break;
                case 2:
                    csm.add();
                    break;
                case 3:
                    System.out.print("Id: ");
                    csm.search(Integer.parseInt(input.nextLine()));
                    break;
                case 4:
                    csm.save();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error!! Choice again!!");
            }
        } while (true);
    }

}
