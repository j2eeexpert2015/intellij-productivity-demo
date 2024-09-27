package lfe.sample.refactoring;

public class RetailTransaction {

    public static final double SALES_TAX_RATE = 0.07;
    public static final String DOWNTOWN_STORE = "Downtown Store";


    // Printing transaction details
    private void printTransactionDetails(final String customerName) {
        Product myProduct = new Product("Laptop", 1500);
        System.out.println("Customer: " + customerName);
        
        System.out.println("Product: " + myProduct.getName());
        System.out.println("Store Location: " + "Downtown Store");
        System.out.println("Price: $" + myProduct.getPrice());
        System.out.println("Sales Tax: $" + (myProduct.getPrice() * SALES_TAX_RATE));
        System.out.println("Discount is : " + 10.01);
        System.out.println("Total Amount: $" + (myProduct.getPrice() + myProduct.getPrice() * SALES_TAX_RATE));

        printReceipt();
    }

    // Print receipt
    private void printReceipt() {

        System.out.println("Thank you for shopping at " + "Downtown Store");
    }

    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }

    public static void main(String[] args) {
        RetailTransaction transaction = new RetailTransaction();
        transaction.printTransactionDetails("John Doe");
    }
}

