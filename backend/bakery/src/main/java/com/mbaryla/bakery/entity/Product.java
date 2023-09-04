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
    private Long id;

    @Column(name="productName")
    private String name;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="subcategoryId")
    private Long subcategoryId;


    @ManyToOne
    @JoinColumn(name = "subcategoryId", referencedColumnName = "subcategoryId", insertable = false, updatable = false)
    private Subcategory subcategory;



}
//    @Column(name = "productName", length = 30)
//    private String productName;
//
//    @Column(name = "subcategoryId")
//    private int subcategoryId;
//
//    @Column(name = "price", precision = 5, scale = 2)
//    private BigDecimal price;
//
//    @ManyToOne
//    @JoinColumn(name = "subcategoryId", referencedColumnName = "subcategoryId", insertable = false, updatable = false)
//    private Subcategory subcategory;

//    CREATE TABLE products(
//        productId int auto_increment,
//        productName varchar(30),
//        subcategoryId int,
//        price numeric(5,2),
//        PRIMARY KEY(productId),
//        FOREIGN KEY(subcategoryId) REFERENCES subcategories(subcategoryId)
//            );