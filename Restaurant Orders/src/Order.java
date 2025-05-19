/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.*;

public class Order {
    private String customerName;
    private List<OrderItem> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:\n");
        sb.append("Name: ").append(customerName).append("\n");
        for (OrderItem item : items) {
            sb.append("- ").append(item.getDetails())
              .append(" | RM ").append(item.getPrice()).append("\n");
        }
        sb.append("Total Price: RM ").append(calculateTotal());
        return sb.toString();
    }
}

