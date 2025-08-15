package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tutorial.ecommercerestapi.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
