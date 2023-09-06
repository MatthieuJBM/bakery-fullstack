export async function getProducts() {
  const url = "http://localhost:8080/bakery/products";
  const response = await fetch(url);
  if (!response.ok) {
    throw new Error("Something went wrong fetching the data!");
  }
  const responseJson = await response.json();
  const responseData = responseJson._embedded.products;
  const loadedProducts = [];
  for (const key in responseData) {
    loadedProducts.push({
      productId: responseData[key].productId,
      productName: responseData[key].productName,
      productPrice: responseData[key].productPrice,
      // subcategoryId: responseData[key].subcategoryId,
      //_links: responseData[key]._links.,
    });
  }
  return loadedProducts;
}
