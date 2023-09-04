package com.mbaryla.bakery.dao;

import com.mbaryla.bakery.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
}
