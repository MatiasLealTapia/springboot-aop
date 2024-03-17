package com.matias.curso.springboot.app.aop.springbootaop.services;

public interface IGreetingService {
    String sayHello(String person, String phrase);
    String sayHelloError(String person, String phrase);
}
