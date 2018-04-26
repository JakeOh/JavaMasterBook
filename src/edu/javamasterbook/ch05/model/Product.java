package edu.javamasterbook.ch05.model;

public class Product {
    public enum Category {
        BOOK, DVD, STATIONARY
    }

    private int productId;
    private String productName;
    private int productPrice;
    private Category category;

    public Product(int productId, String productName, int productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        String str = String.format("Product{id:%d, name:%s, price:%d, category:%s}",
                productId, productName, productPrice, category);

        return str;
    }
}
