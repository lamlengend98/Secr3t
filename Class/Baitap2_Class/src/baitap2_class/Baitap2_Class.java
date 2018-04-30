
package baitap2_class;


public class Baitap2_Class {

    
    public static void main(String[] args) {
        Student s1 = 
                new Student("AT001", 20, 9, "AT");
        System.out.println(s1.printinfo());
        if(s1.hocBong())
            System.out.println("Dat hoc bong");
        else
            System.out.println("Khong dat hFoc bong");
        System.out.println("=================");
        
        Student s2 = new Student();
        System.out.println(s2.inputinfo());
        System.out.println(s2.printinfo());
        System.out.println(s2.hocBong());
    }
    
}
