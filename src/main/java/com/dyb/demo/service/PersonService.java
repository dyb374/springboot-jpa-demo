package com.dyb.demo.service;

import com.dyb.demo.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person addPerson(Person person);
    Person findPersonById(Integer id);
    List<Person> listAll();
}
