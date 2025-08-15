package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tutorial.ecommercerestapi.entities.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
