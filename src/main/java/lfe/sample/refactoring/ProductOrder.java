package lfe.sample.refactoring;

public class ProductOrder {
    private String productId;
    private int quantity;
    private double price;
    private String customerName;
    private String shippingAddress;

    public ProductOrder(String productId, int quantity, double price, String customerName, String shippingAddress) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "ProductOrder [productId=" + productId + ", quantity=" + quantity +
                ", price=" + price + ", customerName=" + customerName +
                ", shippingAddress=" + shippingAddress + "]";
    }

    public static void main(String[] args) {
        ProductOrder order = new ProductOrder("P1234", 2, 199.99, "Alice Johnson", "123 Elm Street, Springfield");
        System.out.println(order);
    }
}

