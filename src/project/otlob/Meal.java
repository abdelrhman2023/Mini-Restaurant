/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.otlob;

import java.util.logging.Logger;

/**
 *
 * @author A.S.A
 */
public class Meal {
    private String Name;
    private String Price;
    private String Describtion;

    public Meal(String Name, String Price, String Describtion) {
        this.Name = Name;
        this.Price = Price;
        this.Describtion = Describtion;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public void setDescribtion(String Describtion) {
        this.Describtion = Describtion;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getDescribtion() {
        return Describtion;
    }
    

}