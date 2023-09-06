package com.mbaryla.bakery.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table(name = "PositionsConnectorWithEntities")
@Data
public class PositionsConnectorWithEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "positionId")
    private Long positionId;

    @Column(name = "entityId")
    private Long entityId;
}

//    CREATE TABLE PositionsConnectorWithEntities(
//        positionId int REFERENCES Positions(positionId),
//    entityId varchar(10) REFERENCES Entities(entityId)
//        );