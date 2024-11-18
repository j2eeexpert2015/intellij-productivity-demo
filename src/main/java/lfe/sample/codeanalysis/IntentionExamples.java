package lfe.sample.codeanalysis;

import java.util.ArrayList;

public class IntentionExamples {

    public static void main(String[] args) {

        ArrayList<Product> products = createProductList();

        System.out.println("INITIAL PRODUCTS IN ORDER: " + products.size());

        double totalCost = processOrder(products);

        System.out.println("FINAL PRODUCTS IN ORDER: " + products.size());
        System.out.println("TOTAL ORDER COST: $" + totalCost);
    }

    private static ArrayList<Product> createProductList() {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product("Product-" + (i + 1), 10 + i));
        }
        return products;
    }

    private static double processOrder(ArrayList<Product> products) {
        double totalCost = 0;

        for (int i = 0; i < products.size();) {
            Product product = products.remove(i); // Simulate processing
            totalCost += product.getPrice();
            System.out.println(product.getName() + ": $" + product.getPrice());
        }

        return totalCost;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
