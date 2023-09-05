import { useQuery } from "@tanstack/react-query";
import styled from "styled-components";
import { getProducts } from "../../services/apiProducts";
import Spinner from "../../ui/Spinner";
import ProductRow from "./ProductRow";

const Table = styled.div`
  border: 1px solid var(--color-amber-200);
  font-size: 1.4rem;
  background-color: var(--color-amber-0);
  border-radius: 7px;
  overflow: hidden;
`;

const TableHeader = styled.header`
  display: grid;
  //grid-template-columns: 0.6fr 1.8fr 2.2fr 1fr 1fr 1fr;
  grid-template-columns: 3fr 1.5fr 0.5fr 0.5fr;
  column-gap: 2.4rem;
  align-items: center;

  background-color: var(--color-amber-50);
  border-bottom: 1px solid var(--color-amber-100);
  text-transform: uppercase;
  letter-spacing: 0.4px;
  font-weight: 600;
  color: var(--color-amber-600);
  padding: 1.6rem 2.4rem;
`;

function ProductsTable() {
  const {
    isLoading,
    data: products,
    error,
  } = useQuery({
    queryKey: ["product"],
    queryFn: getProducts,
  });

  if (isLoading) return <Spinner />;

  return (
    <Table role="table">
      <TableHeader role="row">
        <div>Products name</div>
        <div>Price</div>
      </TableHeader>
      {products.map((product) => (
        <ProductRow product={product} key={product.id} />
      ))}
    </Table>
  );
}

export default ProductsTable;

//productId, productName, subcategoryId, price
