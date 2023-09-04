CREATE TABLE Entities(
	entityId varchar(10),
	entityName varchar(30),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10),
	PRIMARY KEY (entityId)
);
CREATE TABLE Positions(
	positionName varchar(30),
	entityId varchar(10) REFERENCES Entities(entityId)
);
CREATE TABLE EntitiesCosts(
	entityId varchar(10) REFERENCES Entities(entityId),
	rental numeric(8,2),
	utilities numeric(8,2),
	employeesSalariesSum numeric(8,2),
	income numeric(8,2),
	profit numeric(8,2),
    date datetime(6) DEFAULT NULL
);
CREATE TABLE Employees(
	emplId varchar(10),
	firstName varchar(30),
	lastName varchar(30),
	salary numeric(8,2),
	startDate date,
	endDate date,
	entityId varchar(10) REFERENCES Entities(entityId),
	PRIMARY KEY (emplId)
);
CREATE TABLE EmployeesContactInfo(
	emplId varchar(10) REFERENCES Employees(emplId),
	email varchar(40),
	phone varchar(20),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10)
);
CREATE TABLE EmergencyContact(
	emplId varchar(10) REFERENCES Employees(emplId),
	phone varchar(20),
	city varchar(40),
	street varchar(40),
	streetNumber varchar(10),
	zipCode varchar(10)
);