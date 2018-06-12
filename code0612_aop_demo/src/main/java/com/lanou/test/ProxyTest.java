package com.lanou.test;

import com.lanou.proxy.PersonServiceProxy;
import com.lanou.service.PersonService;
import com.lanou.service.UserService;
import com.lanou.service.impl.PersonServiceImpl;

public class ProxyTest {
    public static void main(String[] args) {
//        UserService service = new UserService();
//        service.add();
//        PersonServiceImpl service = new PersonServiceImpl();
//        service.add();

        PersonService personService=new PersonServiceProxy();

        personService.add();
    }
}
