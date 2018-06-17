//UserManager
package demo_collection_1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        UserManager um = new UserManager();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("-----------------------");
            System.out.println("1. Add user.");
            System.out.println("2. List user.");
            System.out.println("3. Search user.");
            System.out.println("4. Update user.");
            System.out.println("5. Exit.");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());
            System.out.println("-----------------------");
            
            switch(choice){
                case 1:
                    um.createUser();
                    break;
                case 2: 
                    um.printUser();
                    break;
                case 3:
                    System.out.print("Input username: ");
                    String name = input.nextLine();
                    System.out.println("");
                    um.searchUser(name);
                    break;
                case 4:
                    um.updateUser();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error!!\nChoice again: ");
            }
        }while(true);
    }
    
}
