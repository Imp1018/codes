package com.lanou.web.controller;

import com.lanou.entity.Person;
import com.lanou.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();

    }
    @ResponseBody
    @RequestMapping("/add")
    public Person add(Person person){
       return personService.add(person);
    }
}
