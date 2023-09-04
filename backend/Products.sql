CREATE DATABASE IF NOT EXISTS Bakery;
USE Bakery;

CREATE TABLE allergens(
	allergenId int auto_increment,
    allergenName varchar(30),
    PRIMARY KEY(allergenId)
);
CREATE TABLE ingredients(
	ingredientId int auto_increment,
    ingredientName varchar(60),
    manufacturer varchar(30),
    price numeric(3,2),
    PRIMARY KEY(ingredientId)
);
CREATE TABLE allergensConnectorToIngredients(
	ingredientId int,
    allergenId int,
    PRIMARY KEY(ingredientId, allergenId)
);
CREATE TABLE nourishmentTable(
	nourishmentId int auto_increment,
    ingredientId int UNIQUE,
    calories numeric(3,2),
    protein numeric(3,2),
    fat numeric(3,2),
    sugar numeric(3,2),
    salt numeric(3,2),
    PRIMARY KEY(nourishmentId),
    FOREIGN KEY(ingredientId) REFERENCES ingredients(ingredientId)
);
CREATE TABLE basicIngredients(
	basicIngredientId int auto_increment,
    basicIngredientName varchar(60),
    PRIMARY KEY(basicIngredientId)
);
CREATE TABLE basicIngredientsConnectorToIngredients(
	ingredientId int,
    basicIngredientId int,
    PRIMARY KEY(ingredientId, basicIngredientId)
);
CREATE TABLE ingredientsWeight(
	ingredientId int,
    ingredientWeight numeric(5,2),
    FOREIGN KEY(ingredientId) REFERENCES ingredients(ingredientId)
);
CREATE TABLE categories(
	categoryId int auto_increment,
    categoryName varchar(30),
    PRIMARY KEY(categoryId)
);
CREATE TABLE subcategories(
	subcategoryId int auto_increment,
    subcategoryName varchar(30),
    categoryId int,
    PRIMARY KEY(subcategoryId),
    FOREIGN KEY(categoryId) REFERENCES categories(categoryId)
);
CREATE TABLE products(
	productId int auto_increment,
    productName varchar(30),
    subcategoryId int,
    price numeric(5,2),
    PRIMARY KEY(productId),
    FOREIGN KEY(subcategoryId) REFERENCES subcategories(subcategoryId)
);
CREATE TABLE components(
	productId int,
    ingredientId int,
    FOREIGN KEY(productId) REFERENCES products(productId),
    FOREIGN KEY(ingredientId) REFERENCES ingredientsWeight(ingredientId)
);

INSERT INTO categories(categoryName) VALUES("Wypieki");
INSERT INTO categories(categoryName) VALUES("Ciasta");
INSERT INTO categories(categoryName) VALUES("Torty");
INSERT INTO categories(categoryName) VALUES("Dekoracje");
INSERT INTO categories(categoryName) VALUES("Napoje");
SELECT * FROM categories;

INSERT INTO subcategories(subcategoryName, categoryId) VALUES("Drożdżówki", 1);
INSERT INTO subcategories(subcategoryName, categoryId) VALUES("Pączki", 1);
INSERT INTO subcategories(subcategoryName, categoryId) VALUES("Pizze", 1);
INSERT INTO subcategories(subcategoryName, categoryId) VALUES("Cebulaki", 1);
SELECT * FROM subcategories;

-- SELECT c.categoryName, s.subcategoryName FROM categories c JOIN subcategories s
-- ON c.categoryId=s.categoryId;

INSERT INTO products(productName, subCategoryId, price) VALUES("Drożdżówka z Czekoladą", 1, 3.50);
INSERT INTO products(productName, subCategoryId, price) VALUES("Drożdżówka z Serem", 1, 4.00);
INSERT INTO products(productName, subCategoryId, price) VALUES("Drożdżówka z Marmeladą", 1, 3.50);
INSERT INTO products(productName, subCategoryId, price) VALUES("Rogal z Bitą Śmietaną", 1, 5.00);

SELECT * FROM products;


SELECT * FROM ingredients;











