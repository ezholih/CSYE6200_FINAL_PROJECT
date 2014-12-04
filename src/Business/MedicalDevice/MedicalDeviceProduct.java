/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.MedicalDevice;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Martin
 */
public class MedicalDeviceProduct {
    
    private int productID;
    private static int count=1;
    private String name;
    private String model;
    private String description;
    private double price;
    private String Classification;
    private UserAccount manufacturer;

    public MedicalDeviceProduct() {
        productID = count;
        count++;
    }

    public int getProductID() {
        return productID;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    public UserAccount getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(UserAccount manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String toString(){
        return String.valueOf(productID);
    }
}
