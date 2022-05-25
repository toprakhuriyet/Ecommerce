package src.ecommerce;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String color;
    private String category;
    private long stockInfo;
    private Double weight;
    private String description;

    public Product(UUID id, String name, String color, String category, long stockInfo, Double weight,
            String description) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.category = category;
        this.stockInfo = stockInfo;
        this.weight = weight;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getStockInfo() {
        return stockInfo;
    }

    public void setStockInfo(long stockInfo) {
        this.stockInfo = stockInfo;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setdecreasedStockInfo(int number) {
        this.stockInfo = this.stockInfo - number;
    }

}
