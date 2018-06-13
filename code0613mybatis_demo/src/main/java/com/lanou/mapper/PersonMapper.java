package com.lanou.mapper;

import com.lanou.entity.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> findAll();

    int insert(Person person);

    List<Person>findByNameLike(String str);
}
