package com.dyb.demo.service.impl;

import com.dyb.demo.entity.Person;
import com.dyb.demo.repository.PersonRepository;
import com.dyb.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person findPersonById(Integer id) {
        Person person = personRepository.findById(id).orElse(null);
        return person;
    }

    @Override
    public List<Person> listAll() {
        List<Person> personList = personRepository.findAll();
        return personList;
    }
}
