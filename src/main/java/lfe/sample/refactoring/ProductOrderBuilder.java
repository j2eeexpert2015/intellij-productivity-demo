package lfe.sample.refactoring;

public class ProductOrderBuilder {
    private String productId;
    private int quantity;
    private double price;
    private String customerName;
    private String shippingAddress;

    public ProductOrderBuilder setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public ProductOrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductOrderBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductOrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public ProductOrderBuilder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public ProductOrder createProductOrder() {
        return new ProductOrder(productId, quantity, price, customerName, shippingAddress);
    }
}