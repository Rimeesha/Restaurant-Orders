/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.*;

public class OrderApp {
    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> foodBox, drinkBox;
    private JCheckBox vegCheck, alcoholCheck;
    private JTextArea outputArea;
    private JButton orderButton;

    public void createAndShowGUI() {
        frame = new JFrame("Food & Drink Order App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        inputPanel.add(new JLabel("Customer Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Choose Food:"));
        String[] foods = {"Biryani", "Fried Rice", "Salad"};
        foodBox = new JComboBox<>(foods);
        inputPanel.add(foodBox);

        inputPanel.add(new JLabel("Vegetarian?"));
        vegCheck = new JCheckBox();
        inputPanel.add(vegCheck);

        inputPanel.add(new JLabel("Choose Drink:"));
        String[] drinks = {"Mango Juice", "Coke", "Beer"};
        drinkBox = new JComboBox<>(drinks);
        inputPanel.add(drinkBox);

        inputPanel.add(new JLabel("Alcoholic?"));
        alcoholCheck = new JCheckBox();
        inputPanel.add(alcoholCheck);

        orderButton = new JButton("Place Order");
        inputPanel.add(orderButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        orderButton.addActionListener(e -> processOrder());

        frame.setVisible(true);
    }

    private void processOrder() {
        String name = nameField.getText();
        String foodName = (String) foodBox.getSelectedItem();
        String drinkName = (String) drinkBox.getSelectedItem();
        boolean isVeg = vegCheck.isSelected();
        boolean isAlcohol = alcoholCheck.isSelected();

        double foodPrice = foodName.equals("Salad") ? 8.0 : 12.0;
        double drinkPrice = drinkName.equals("Beer") ? 6.0 : 4.0;

        Food food = new Food(foodName, foodPrice, isVeg);
        Drink drink = new Drink(drinkName, drinkPrice, isAlcohol);

        Order order = new Order(name);
        order.addItem(food);
        order.addItem(drink);

        outputArea.setText(order.generateSummary());
    }
}

