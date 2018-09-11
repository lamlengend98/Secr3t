/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

/**
 *
 * @author USER
 */
public class Teacher extends Person {
    private String rank;

    public Teacher() {
    }

    public Teacher(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public void print() {
        System.out.println("======Teacher======");
        super.print(); 
        System.out.print("Rank: ");
        this.setRank(input.nextLine());
        System.out.println("===================");
    }

    @Override
    public String toString() {
        return super.toString() + "\nRank: "+this.getRank(); 
    }
}
