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
        ProductOrder order = new ProductOrderBuilder().setProductId("P1234").setQuantity(2).setPrice(199.99).setCustomerName("Alice Johnson").setShippingAddress("123 Elm Street, Springfield").createProductOrder();
        System.out.println(order);
    }
}

