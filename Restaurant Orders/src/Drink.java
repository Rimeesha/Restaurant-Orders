/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Drink implements OrderItem {
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String getDetails() {
        return name + (isAlcoholic ? " (Alcoholic)" : "");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

