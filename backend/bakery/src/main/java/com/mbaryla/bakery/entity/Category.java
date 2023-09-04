package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table(name="categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categoryId")
    private Long id;

    @Column(name="categoryName")
    private String name;
}

//    CREATE TABLE categories(
//        categoryId int auto_increment,
//        categoryName varchar(30),
//    PRIMARY KEY(categoryId)
//);
