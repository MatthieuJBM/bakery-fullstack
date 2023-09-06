package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name="products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productId")
    private Long productId;

    @Column(name="productName")
    private String productName;

    @Column(name="productPrice")
    private BigDecimal productPrice;

//    @Column(name="subcategoryId")
//    private Long subcategoryId;


    @ManyToOne
    @JoinColumn(name = "subcategoryId", referencedColumnName = "subcategoryId", insertable = false, updatable = false)
    private Subcategory subcategory;



}

//    CREATE TABLE products(
//        productId int auto_increment,
//        productName varchar(30),
//        subcategoryId int,
//        price numeric(5,2),
//        PRIMARY KEY(productId),
//        FOREIGN KEY(subcategoryId) REFERENCES subcategories(subcategoryId)
//            );