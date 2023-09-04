package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table(name="subcategories")
@Data
public class Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subcategoryId")
    private Long id;

    @Column(name="subcategoryName")
    private String name;

    @Column(name="categoryId")
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId", insertable = false, updatable = false)
    private Category category;

}

//    CREATE TABLE subcategories(
//        subcategoryId int auto_increment,
//        subcategoryName varchar(30),
//    categoryId int,
//            PRIMARY KEY(subcategoryId),
//            FOREIGN KEY(categoryId) REFERENCES categories(categoryId)
//            );