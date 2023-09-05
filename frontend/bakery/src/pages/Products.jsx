import Row from "../ui/Row";
import Heading from "../ui/Heading";
import ProductsTable from "../features/products/ProductsTable";

function Products() {
  return (
    <>
      <Row type="horizontal">
        <Heading as="h1">All products</Heading>
      </Row>
      <Row>
        <ProductsTable />
      </Row>
    </>
  );
}

export default Products;
