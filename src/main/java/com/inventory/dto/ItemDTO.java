package com.inventory.dto;

import java.math.BigDecimal;

public class ItemDTO {
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private Integer status;
    public ItemDTO() {super();}
    public ItemDTO(Long id, String name, BigDecimal price, Integer stock, Integer status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }
    public ItemDTO(String name, BigDecimal price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
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
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getStatus() {return status;}
    public void setStatus(Integer status) {this.status = status;}
}
