USE Bakery;
DROP TABLE IF EXISTS Entities;
DROP TABLE IF EXISTS Positions;
DROP TABLE IF EXISTS PositionsConnectorWithEntities;
DROP TABLE IF EXISTS EntitiesCosts;
DROP TABLE IF EXISTS EmergencyContact;
DROP TABLE IF EXISTS EmployeesContactInfo;
DROP TABLE IF EXISTS Employees;


CREATE TABLE Entities(
	entityId int auto_increment,
	entityName varchar(30),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10),
	PRIMARY KEY (entityId)
);


CREATE TABLE Positions(
	positionId int auto_increment,
    positionName varchar(45),
    PRIMARY KEY (positionId)
);


CREATE TABLE PositionsConnectorWithEntities(
	positionId int REFERENCES Positions(positionId),
	entityId varchar(10) REFERENCES Entities(entityId)
);


CREATE TABLE EntitiesCosts(
	entityId int REFERENCES Entities(entityId),
	rental numeric(8,2),
	utilities numeric(8,2),
	employeesSalariesSum numeric(8,2),
	income numeric(8,2),
	profit numeric(8,2),
    date datetime(6) DEFAULT NULL
);


CREATE TABLE Employees(
	emplId int,
	firstName varchar(30),
	lastName varchar(30),
	salary numeric(8,2),
	startDate date,
	endDate date,
	entityId varchar(10) REFERENCES Entities(entityId),
	PRIMARY KEY (emplId)
);

CREATE TABLE EmployeesContactInfo(
	emplId int REFERENCES Employees(emplId),
	email varchar(40),
	phone varchar(20),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10)
);

CREATE TABLE EmergencyContact(
	emplId int REFERENCES Employees(emplId),
	phone varchar(20),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10)
);