package designpattern.structural.facade;

import java.math.BigDecimal;

public class Item {

    private String id;
    private String name;
    private BigDecimal price;

    private boolean isInStock;

    public Item(String id, String name, BigDecimal price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
