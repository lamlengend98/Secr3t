/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ManageList {

    private ManageList[] list;
    private int index;
    private int size = 10;
    private String id;
    private String name;
    private double mark;
    
    Scanner input = new Scanner(System.in);

    public ManageList(ManageList[] list) {
        this.list = new ManageList[size];
    }

    public ManageList(String id, String name, double mark, String rank) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        
    }

    public ManageList() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    

    public void input() {
        //Thao tác với mã
        do{
        System.out.print("ID: ");
        String msv = input.nextLine();
        if(checkId(msv)) {
            this.setId(msv);
            break;
        }
            System.out.println("sai dinh dang!");
        }while(true);
        
        //Nhập tên
        System.out.print("Name: ");
        this.setName(input.nextLine());

        //Thao tác với điểm
        do {
            do{
            try{
            System.out.print("Mark: ");
            this.setMark(Double.parseDouble(input.nextLine()));
            }catch(NumberFormatException e){
                System.out.println("Vui long nhap so!!");
            }
            }while(false);
        } while (mark > 10 || mark <= 0);
       

    }

    public void print() {

        System.out.println("---------Student Infomation--------");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Mark: " + this.getMark());

        //Điều kiện xếp loại
        if (this.getMark() < 4.0) {
            System.out.println("Rank: Kem");
        } else if (this.getMark() >= 4.0 && this.getMark() < 6.0) {
            System.out.println("Rank: Trung Binh");
        } else if (this.getMark() >= 6.0 && this.getMark() < 8.0) {
            System.out.println("Rank: Kha");
        } else if (this.getMark() >= 8.0) {
            System.out.println("Rank: Gioi");
        }
        System.out.println("-----------------------------------");

    }

    private boolean checkId(String id) {
        boolean check = id.matches("HV\\d{3}");
        return check;
    }
}
