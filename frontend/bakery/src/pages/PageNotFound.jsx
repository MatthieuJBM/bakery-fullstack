import styled from "styled-components";
//import { useMoveBack } from "../hooks/useMoveBack";
import Heading from "../ui/Heading";

const StyledPageNotFound = styled.main``;

const Box = styled.div``;

function PageNotFound() {
  //const moveBack = useMoveBack();

  return (
    <StyledPageNotFound>
      <Box>
        <Heading as="h1">
          The page you are looking for could not be found 😢{" "}
        </Heading>
        {/* <button onClick={moveBack}>&larr; Go back</button> */}
      </Box>
    </StyledPageNotFound>
  );
}

export default PageNotFound;
