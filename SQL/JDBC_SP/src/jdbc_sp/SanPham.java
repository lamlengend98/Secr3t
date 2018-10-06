/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_sp;
import java.util.Date;

/**
 *
 * @author lamng
 */
public class SanPham {
    private int id;
    private String name;
    private double price;
    private String description;
    private Date created;

    public SanPham() {
    }

    public SanPham(int id, String name, double price, String description, Date created) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.created = created;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.price + " " + this.description + " " + this.created;
    }
    
}
