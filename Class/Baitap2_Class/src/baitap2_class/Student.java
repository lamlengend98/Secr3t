
package baitap2_class;

import java.util.Scanner;


public class Student {
    private String ID;
    private double mark;
    private int age;
    private String classes;

    public Student(String ID, double mark, int age, String classes) {
        this.ID = ID;
        this.mark = mark;
        this.age = age;
        this.classes = classes;
    }
    
    public Student(){
        this.ID = "";
        this.mark = 0;
        this.age = 1;
        this.classes = "";
    }

    public String getID() {
        return ID;
    }

    public double getMark() {
        return mark;
    }

    public int getAge() {
        return age;
    }

    public String getClasses() {
        return classes;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    public int inputinfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Ma SV: ");
        ID = input.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap diem trung binh: ");
        mark = Double.parseDouble(input.nextLine());
        System.out.print("Nhap lop: ");
        classes = input.nextLine();        
        return 0;
    }
    
    public String printinfo(){
        return "Ma SV: "+ID+ "\nTuoi: "+age+"\nDiem trung binh: "+mark+"\nLop: "+classes;
    }
    
    public boolean hocBong(){
        return mark >= 8.0;
    }
}
