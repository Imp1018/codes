package com.lanou.service.impl;

import com.lanou.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Override
    public void add() {
        System.out.println("add*******");
    }

    @Override
    public void delete() {
        System.out.println("delete------");
    }

    @Override
    public void update() {
        System.out.println("update@@@@@@@");
    }

    @Override
    public void select() {
        System.out.println("select=======");
    }
}
