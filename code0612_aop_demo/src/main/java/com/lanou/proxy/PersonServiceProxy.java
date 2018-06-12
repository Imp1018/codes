package com.lanou.proxy;

import com.lanou.service.PersonService;
import com.lanou.service.impl.PersonServiceImpl;

public class PersonServiceProxy implements PersonService {
    private PersonService personService;

    public PersonServiceProxy() {
        personService=new PersonServiceImpl();
    }

    @Override
    public void add() {
        System.out.println("add方法开始......");
        personService.add();
        System.out.println("add方法结束......");
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void select() {

    }
}
