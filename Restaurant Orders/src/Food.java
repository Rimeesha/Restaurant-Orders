/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Food implements OrderItem {
    private String name;
    private double price;
    private boolean isVegetarian;

    public Food(String name, double price, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getDetails() {
        return name + (isVegetarian ? " (Vegetarian)" : "");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

