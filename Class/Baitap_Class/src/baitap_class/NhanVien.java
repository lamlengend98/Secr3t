
package baitap_class;

import java.util.Scanner;


public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int jobtime;

    public NhanVien(String name, int age, String address, double salary, int jobtime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.jobtime = jobtime;
    }

    public NhanVien(){
        this.name = "";
        this.age = 1;
        this.address = "";
        this.salary = 0;
        this.jobtime = 0;
    }

    

    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getJobtime() {
        return jobtime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobtime(int jobtime) {
        this.jobtime = jobtime;
    }

    
    
    public int inputinfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap dia chi: ");
        address = input.nextLine();
        System.out.print("Nhap luong: ");
        salary  = Double.parseDouble(input.nextLine());
        System.out.print("Nhap tong so gio lam: ");
        jobtime = Integer.parseInt(input.nextLine());
        return 0;
    }
    
    public String printinfo(){
        return "Ten: "+name+ "\nTuoi: "+age+"\nDia chi: "+address+"\nLuong: "+salary+"\nTong so gio lam: "+jobtime;
    }
    
    public String tinhThuong(){
        
        if(jobtime >= 200)
            return "Luong thuong =  "+(salary*20/100);
        else if(jobtime < 200 && jobtime >= 100)
            return "Luong thuong = "+(salary*10/100);
        else if(jobtime < 100)
            return "Luong thuong = 0";
        return null;
        
    }

    
}

