package org.example;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class shoppingcartapp {
    int numberOfItems = 0;
    double totalCost = 0.0;
    double price = 0.0;

    public void addItem(int quantity, double price) {
        this.totalCost += quantity * price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        shoppingcartapp cart = new shoppingcartapp();

        System.out.println("Enter the language: 1 for English, 2 for Finnish, 3 for Swedish, 4 for japanese");
        int language = scanner.nextInt();
        Locale locale;
        switch (language) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        System.out.println(bundle.getString("items"));
        cart.numberOfItems = scanner.nextInt();

        //number of different items
        //price of each item
        // quantity of each item

        for (int i = 0; i < cart.numberOfItems; i++) {
            System.out.println(bundle.getString("price") + (i + 1));
            cart.price = scanner.nextDouble();
            System.out.println(bundle.getString("quantity") + (i + 1));
            int quantity = scanner.nextInt();
            cart.addItem(quantity, cart.price);
        }
        System.out.println("Total cost: " + cart.totalCost);
    }

}
