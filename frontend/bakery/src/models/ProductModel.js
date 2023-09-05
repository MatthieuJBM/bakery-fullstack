class ProductModel {
  constructor(productId, productName, subcategoryId, price) {
    this.productId = productId;
    this.productName = productName;
    this.subcategoryId = subcategoryId;
    this.price = price;
  }
}

export default ProductModel;

//CREATE TABLE products(
//  productId int auto_increment,
//  productName varchar(30),
//  subcategoryId int,
//  price numeric(5,2),
//  PRIMARY KEY(productId),
//  FOREIGN KEY(subcategoryId) REFERENCES subcategories(subcategoryId)
//);
