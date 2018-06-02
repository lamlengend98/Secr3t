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
    Scanner input = new Scanner(System.in);
    
    public List() {
        this.list = new Information[size];
        index=0;
    }
    
    public void input(){
        
        System.out.print("Choice type: ");
        ch = input.nextLine();
        do{                
        switch(ch){
            case "Paper":
                Paper p = new Paper();
                p.input();
                list[index++] = p;
                break;
            case "Book":
                Book b = new Book();
                b.input();
                list[index++] = b;
                break;  
            case "Thesis":
                Thesis t = new Thesis();
                t.input();
                list[index++] = t;
                break;
            default:
                System.out.println("Error! Choice again!!");
        }
            break;
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
    
    public void search(){
        boolean found = false;
        for(int i = 0; i < index; i++){
            System.out.print("Search type: ");
            String chon = input.nextLine();
            System.out.print("Type title: ");
            String name = input.nextLine();
            switch(chon){
            case "Paper":
                if(list[i] instanceof Paper && list[i].getTitle().equalsIgnoreCase(name)){
                System.out.println("------PAPER------");
                System.out.println(list[i]);
                found = true;
                break;
                }
            case "Book":
                if(list[i] instanceof Book && list[i].getTitle().equalsIgnoreCase(name)){
                System.out.println("------BOOK------");
                System.out.println(list[i]);
                found = true;
                break;
                }
            case "Thesis":
                if(list[i] instanceof Thesis && list[i].getTitle().equalsIgnoreCase(name)){
                System.out.println("------THESIS------");    
                System.out.println(list[i]);
                found = true;
                break;
                }                        
             }
          if(!found)
             System.out.println("Not found!!");
        }
    }
}
