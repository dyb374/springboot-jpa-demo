package com.dyb.demo.controller;

import com.dyb.demo.entity.Person;
import com.dyb.demo.entity.Result;
import com.dyb.demo.service.PersonService;
import com.dyb.demo.untils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    /**
     * @param id
     * @return Person
     */
    @GetMapping(value = "/persons/{id}")
    public Person findPersonById(@PathVariable() Integer id){
        Person person = personService.findPersonById(id);
        return person;
    }


    /*
    添加@Valid注解来验证传入的数据，需符合entity中设置的约束条件,不将验证结果放在bindingResult对象中,而是会抛出异常
     */
    @PostMapping(value = "/persons")
    public Result<Person> addPerson(@Valid Person person){
        return ResultUtil.success(personService.addPerson(person));
    }

    @GetMapping(value = "/persons")
    public List<Person> getAll(){
        return personService.listAll();
    }


}
