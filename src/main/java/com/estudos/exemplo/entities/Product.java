package com.estudos.exemplo.entities;

import java.util.Objects;

public class Product {
    private static long generatorID=1;
    private String name;
    private long id;
    private Category category;
    private double price;
    private int quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.id = generatorID++;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
