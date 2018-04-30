/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap8_class;

public class Baitap8_Class {

        public static void main(String[] args) {
            SoPhuc sp1 = new SoPhuc(1, 2, 3, 4);
            sp1.print();
            sp1.add();
            sp1.sub();
            sp1.mul();
            System.out.println(sp1.div());
            
            SoPhuc sp2 = new SoPhuc();
            sp2.input();
            sp2.print();
            sp2.add();
            sp2.sub();
            sp2.mul();
            sp2.div();
    }
    
}
