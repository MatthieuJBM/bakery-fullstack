package com.mbaryla.bakery.dao;

import com.mbaryla.bakery.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
