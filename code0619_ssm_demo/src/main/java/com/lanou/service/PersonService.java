package com.lanou.service;

import com.lanou.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person add(Person person);
}
