package com.estudos.exemplo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private static long gerarId=1;
    private long id;
    private List<Item> items = new ArrayList<>();
    private double value;

    public Order(){
        this.id = gerarId++;
    }

    public Order(List<Item> items) {
        this.items = items;
        this.value = value;
    }

    public long getId() {
        return id;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
