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
public class Paper extends Information{
    private String journal;
    private int year;

    public Paper(String journal, int year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.journal = journal;
        this.year = year;
    }

    public Paper() {
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input(); 
        System.out.print("Journal: ");
        setJournal(input.nextLine());
        System.out.print("Year-posting: ");
        setYear(input.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "\nJournal: " + getJournal() + "\nYear-posting: " + getYear();         
    }

    
}
