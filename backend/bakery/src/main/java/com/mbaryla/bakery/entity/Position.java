package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table(name = "position")
@Data
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId")
    private Long positionId;

    @Column(name = "positionName")
    private String positionName;

}

//    CREATE TABLE Positions(
//	positionId int auto_increment,
//    positionName varchar(45),
//    PRIMARY KEY (positionId)
//);
