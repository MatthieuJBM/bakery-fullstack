package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "NourishmentTable")
@Data
public class NourishmentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private Long nourishmentId;

    private Long ingredientId;

    private BigDecimal calories;

    private BigDecimal protein;

    private BigDecimal fat;

    private BigDecimal sugar;

    private BigDecimal salt;

}


//    CREATE TABLE nourishmentTable(
//        nourishmentId int auto_increment,
//        ingredientId int UNIQUE,
//        calories numeric(3,2),
//    protein numeric(3,2),
//    fat numeric(3,2),
//    sugar numeric(3,2),
//    salt numeric(3,2),
//    PRIMARY KEY(nourishmentId),
//    FOREIGN KEY(ingredientId) REFERENCES ingredients(ingredientId)
//        );