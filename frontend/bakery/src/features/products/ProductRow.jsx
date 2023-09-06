import { styled, css } from "styled-components";
import ProductModel from "../../models/ProductModel";
import GlobalStyles from "../../styles/GlobalStyles";

const TableRow = styled.div`
  display: grid;
  //grid-template-columns: 4fr 1fr;
  grid-template-columns: 3fr 1.5fr 0.5fr 0.5fr;
  column-gap: 2.4rem;
  align-items: center;
  padding: 1.4rem 2.4rem;

  &:not(:last-child) {
    border-bottom: 1px solid var(--color-amber-100);
  }
`;

const Text = styled.div`
  font-size: 1.6rem;
  font-weight: 600;
  color: var(--color-amber-600);
  font-family: "Sono";
`;

const Button = styled.button`
  font-size: 1.6rem;
  font-weight: 600;
  color: var(--color-grey-900);
  font-family: "Sono";
  border: none;
  border-radius: 7px;
  ${(props) =>
    props.color === "lime-400" &&
    css`
      background-color: var(--color-lime-400);
    `}
  ${(props) =>
    props.color === "red-300" &&
    css`
      background-color: var(--color-red-300);
    `}
`;

ProductRow.propTypes = {
  product: ProductModel,
};

function ProductRow({ product }) {
  const { productName, productPrice } = product;

  return (
    <TableRow role="row">
      <Text>{productName}</Text>
      <Text>{productPrice}</Text>
      <Button color="lime-400">UPDATE</Button>
      <Button color="red-300">DELETE</Button>
    </TableRow>
  );
}

export default ProductRow;
