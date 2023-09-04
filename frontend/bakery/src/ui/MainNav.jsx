import { NavLink } from "react-router-dom";
import styled from "styled-components";
import {
  HiOutlineBuildingStorefront,
  HiUserGroup,
  HiOutlineCurrencyDollar,
  HiUsers,
  HiOutlineCog6Tooth,
  HiOutlineBuildingOffice2,
  HiOutlineShoppingCart,
} from "react-icons/hi2";

const NavList = styled.ul`
  display: flex;
  flex-direction: column;
  gap: 0.8rem;
`;

const StyledNavLink = styled(NavLink)`
  &:link,
  &:visited {
    display: flex;
    align-items: center;
    gap: 1.2rem;

    color: var(--color-grey-600);
    font-size: 1.6rem;
    font-weight: 500;
    padding: 1.2rem 2.4rem;
    transition: all 0.3s;
  }

  /* This works because react-router places the active class on the active NavLink */
  &:hover,
  &:active,
  &.active:link,
  &.active:visited {
    color: var(--color-grey-800);
    background-color: var(--color-amber-200);
    border-radius: var(--border-radius-sm);
  }

  & svg {
    width: 2.4rem;
    height: 2.4rem;
    color: var(--color-grey-800);
    transition: all 0.3s;
  }

  &:hover svg,
  &:active svg,
  &.active:link svg,
  &.active:visited svg {
    color: var(--color-amber-600);
  }
`;

function MainNav() {
  return (
    <nav>
      <NavList>
        <li>
          <StyledNavLink to="/dashboard">
            <HiOutlineBuildingStorefront />
            <span>Home</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="/products">
            <HiOutlineShoppingCart />
            <span>Products</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="/establishments">
            <HiOutlineBuildingOffice2 />
            <span>Establishments</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="Employees">
            <HiUserGroup />
            <span>Employees</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="Finances">
            <HiOutlineCurrencyDollar />
            <span>Finances</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="Users">
            <HiUsers />
            <span>Users</span>
          </StyledNavLink>
        </li>
        <li>
          <StyledNavLink to="Settings">
            <HiOutlineCog6Tooth />
            <span>Settings</span>
          </StyledNavLink>
        </li>
      </NavList>
    </nav>
  );
}

// home, products, establishments, employees,
// finances, users, settings

export default MainNav;
