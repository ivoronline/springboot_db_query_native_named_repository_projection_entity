package com.ivoronline.springboot_db_query_native_named_repository_projection_entity.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ivoronline.springboot_db_query_native_named_repository_projection_entity.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository_projection_entity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  @RequestMapping("SelectPersonByNameAge")
  Person selectPersonByNameAge() throws JsonProcessingException {
    Person person = personRepository.selectPersonByNameAge("John");
    return person;
  }

}


