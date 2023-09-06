class ProductModel {
  constructor(productId, productName, productPrice) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    // this.subcategoryId = subcategoryId;
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
