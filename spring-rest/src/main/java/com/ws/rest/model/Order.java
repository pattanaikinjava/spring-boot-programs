package com.ws.rest.model;

public class Order {
    private Integer id;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String product;

    public Order(){}
    public Order(int id, String product){
        this.id = id;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }
}
