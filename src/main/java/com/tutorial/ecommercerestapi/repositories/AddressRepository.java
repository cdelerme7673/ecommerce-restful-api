package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tutorial.ecommercerestapi.entities.Address;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
