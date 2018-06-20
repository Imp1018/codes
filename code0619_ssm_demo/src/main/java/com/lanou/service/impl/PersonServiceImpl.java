package com.lanou.service.impl;

import com.lanou.entity.Person;
import com.lanou.mapper.PersonMapper;
import com.lanou.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;


    @Override
    @Transactional(readOnly = true)   // 不开启事务环境 只读 不能增删改
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    @Transactional    // 事务管理器  也可以用在类上 相对于此类下所有方法都有事务管理
    public Person add(Person person) {
        personMapper.insert(person);
//            int a = 1/0;


        return personMapper.findById(person.getId());

    }
}
