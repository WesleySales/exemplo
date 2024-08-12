package com.estudos.exemplo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_ID")
    private Product productItem;

    @ManyToOne
    @JoinColumn(name = "order_ID")
    private WS_Order order;

    private int quantity;
    private double price;

    public Item(Long id,Product productItem, int quantity,WS_Order order) {
        this.id=id;
        this.productItem = productItem;
        this.quantity = quantity;
        this.price = productItem.getPrice();
        this.order = order;
    }
    public Item(){}

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return productItem;
    }

    public void setProduct(Product product) {
        this.productItem = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
