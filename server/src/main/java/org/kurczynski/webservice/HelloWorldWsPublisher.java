package org.kurczynski.webservice;

import javax.xml.ws.Endpoint;

public class HelloWorldWsPublisher {
    public static void main(String[] args) {
        System.out.print("Starting web service...");

        Endpoint.publish("http://localhost:8080/Ws/HelloWorld", new HelloWorldImpl());

        System.out.println("done");
    }
}

