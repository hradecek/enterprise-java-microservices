package com.hradecek.ejm;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String sayHello(final String name) {
        return "Hello " + name;
    }
}
