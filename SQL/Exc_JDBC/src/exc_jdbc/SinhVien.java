/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_jdbc;

import java.util.Date;

/**
 *
 * @author lamng
 */
public class SinhVien {

    private int id;
    private String name;
    private String major;
    private Date date;

    public SinhVien() {
    }

    public SinhVien(int id, String name, String major, Date date) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.major + " " + this.date;
    }

}
