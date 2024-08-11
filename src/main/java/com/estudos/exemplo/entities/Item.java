package com.estudos.exemplo.entities;

public class Item {
    private Product product;
    private int quantity;
    private double value;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.value = product.getPrice()*quantity;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
