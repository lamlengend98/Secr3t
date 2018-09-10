/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Classes {
    private Person[] studentList;
    private int numOfStd = 0;
    private int index = 0;
    Scanner input = new Scanner(System.in);
    Student std = new Student();
    Teacher tch = new Teacher();
    Person p = new Person();

    public Classes(Person[] studentList) {
        this.studentList = new Person[numOfStd];
    }

    public Classes() {
    }
    
    public void input(){
        System.out.print("Choice: ");
        String choice = input.nextLine();
        do{
            switch(choice){
                case "Student":
                    System.out.print("Number of student: ");
                    numOfStd = input.nextInt();
                    for (int i = 0; i < numOfStd; i++) {
                        std.print();
                    }
                    studentList[index++] = std;
                    break;
                case "Teacher":
                    tch.print();
                    studentList[index++] = tch;
                    break;
                default:
                    System.out.println("Choice again!!");
            }
            break;
        }while(true);
    }
    
}
