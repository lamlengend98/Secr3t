/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class List {
    private Information[] list;
    private int size = 10;
    private int index;
    private String ch;
    
    public List() {
        this.list = new Information[size];
        index=0;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        do{        
        System.out.print("Choice type: ");
        ch = input.nextLine();
        if("Paper".equals(ch)){
            Paper p = new Paper();
            p.input();
            list[index++] = p;
            break;
        } else if("Book".equals(ch)){
            Book b = new Book();
            b.input();
            list[index++] = b;
            break;
        } else if("Thesis".equals(ch)){
            Thesis t = new Thesis();
            t.input();
            list[index++] = t;
            break;
        } else
            System.out.println("Error!!");        
        }while(true);
    }
    
    public void show(){
        System.out.println("------PAPER------");
        for(int i = 0; i < index; i++){
            if(list[i] instanceof Paper)
                System.out.println(list[i]); 
                     
        }
        System.out.println("------BOOK------");
        for(int i = 0; i < index; i++){
            if(list[i] instanceof Book)
                System.out.println(list[i]);
        }
        System.out.println("------THESIS------");
        for(int i = 0; i < index; i++){
            if(list[i] instanceof Thesis)
                System.out.println(list[i]);
        }
    }
    
    public void search(String cate){
        for(int i = 0; i < index; i++){              
            Boolean found = list[i].getTitle().equals(cate); 
            if(found == true){
                System.out.println("--------------");
                System.out.println(list[i]);
            }                
            else System.out.println("not found");
            }
                
//            if(list[i] instanceof Paper && list[i].getTitle().equals(cate)){
//                System.out.println("------PAPER------");
//                System.out.println(list[i]);
//                found = true;
//                break;
//            }
//            if(list[i] instanceof Book && list[i].getTitle().equals(cate)){
//                System.out.println("------BOOK------");
//                System.out.println(list[i]);
//                found = true;
//                break;
//            }
//            if(list[i] instanceof Thesis && list[i].getTitle().equals(cate)){
//                System.out.println("------THESIS------");    
//                System.out.println(list[i]);
//                found = true;
//                break;
//            }
        
//        if(!found)
//            System.out.println("Not found!!");
        }
}
