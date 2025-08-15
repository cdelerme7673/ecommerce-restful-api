package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tutorial.ecommercerestapi.entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile,Long> {
}
