package org.kurczynski.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    @WebMethod
    String helloWorld(String name);
}
