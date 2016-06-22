package org.kurczynski.webservice;

//import org.kurczynski.webservice.HelloWorld;
//import org.kurczynski.webservice.HelloWorldImplService;

public class Client {
    public static void main(String[] args) {
        HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldImplService.getHelloWorldImplPort();

        System.out.println(helloWorld.helloWorld("Great white buffalo"));
    }
}
