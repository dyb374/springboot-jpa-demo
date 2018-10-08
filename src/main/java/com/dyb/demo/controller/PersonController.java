package com.dyb.demo.controller;

import com.dyb.demo.entity.Person;
import com.dyb.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping(value = "/persons/{id}")
    public Person findPersonById(@PathVariable() Integer id){
        Person person = personService.findPersonById(id);
        return person;
    }


    /*
    添加@Valid注解来验证传入的数据，需符合entity中设置的约束条件,验证结果在bindingResult对象中
     */
    @PostMapping(value = "/persons")
    public Person addPerson(@Valid Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        return personService.addPerson(person);
    }
}
