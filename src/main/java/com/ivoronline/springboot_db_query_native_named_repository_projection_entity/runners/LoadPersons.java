package com.ivoronline.springboot_db_query_native_named_repository_projection_entity.runners;

import com.ivoronline.springboot_db_query_native_named_repository_projection_entity.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository_projection_entity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired PersonRepository personRepository;

  @Override
  @Transactional
  public void run(String... args) {

    //CREATE PERSON
    Person person = new Person();
           person.name = "John";
           person.age  = 20;

    //SAVE PERSON
    personRepository.save(person);

  }

}
