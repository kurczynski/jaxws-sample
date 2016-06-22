package org.kurczynski.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "org.kurczynski.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    public String helloWorld(String name) {
        return "Hello world from " + name;
    }
}
