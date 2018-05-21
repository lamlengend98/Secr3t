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
public class Information {
    private String id;
    private String title;
    private String author;
    private int count;

    public Information() {
    }

    public Information(String id, String title, String author, int count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nBorrow: " + getCount();
    }
    
    public void input(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Id: ");
        this.setId(input.nextLine());
        System.out.print("Title: ");
        this.setTitle(input.nextLine());
        System.out.print("Author: ");
        this.setAuthor(input.nextLine());
        System.out.print("Borrow: ");
        this.setCount(input.nextInt());
    }
}
