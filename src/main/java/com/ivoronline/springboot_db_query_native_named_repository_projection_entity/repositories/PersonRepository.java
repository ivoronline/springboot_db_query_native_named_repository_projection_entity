package com.ivoronline.springboot_db_query_native_named_repository_projection_entity.repositories;

import com.ivoronline.springboot_db_query_native_named_repository_projection_entity.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  @Query(nativeQuery=true)
  Person selectPersonByNameAge(String name);
}


