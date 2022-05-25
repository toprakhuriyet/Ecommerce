package src.ecommerce;

import java.util.UUID;

public class Order {
    private UUID id;
    private int productCount;
    private boolean isPurchased;
    private CreditCard creditCard;
    private User user;
    private Product product;

    public Order(UUID id, int productCount, User user, CreditCard creditCard, Product product) {
        this.id = id;
        this.productCount = productCount;
        this.isPurchased = false;
        this.user = user;
        this.creditCard = creditCard;
        this.product = product;
        user.getOrderedProducts().add(product);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean isPurchased) {
        this.isPurchased = isPurchased;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void purchaseOrder() {
        product.setdecreasedStockInfo(productCount);
        this.isPurchased = true;
    }
}
