/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

import java.sql.Blob;

/**
 *
 * @author tomas
 */
public class Plato {
    int id;
    String category;
    String description;
    Blob image;
    String name;
    int price;

    public Plato() {
    }

    public Plato(int id, String category, String description, Blob image, String name, int price) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
