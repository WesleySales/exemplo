package com.estudos.exemplo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {
    private static long generatorID=1;
    private long id;
    private String name;
    protected List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.id = generatorID++;
        this.name = name;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
