package com.radha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Singleton objA = (Singleton) context.getBean("singleton");

        System.out.println("---- Singleton ----");

        objA.setMessage("I'm object A");
        objA.getMessage();

        Singleton objB = (Singleton) context.getBean("singleton");
        objB.getMessage();

        Singleton objZ = (Singleton) context.getBean("singleton");
        objZ.getMessage();

        System.out.println("----- Prototype ------");

        // Prototype

        Prototype objC = (Prototype) context.getBean("prototype");

        objC.setMessage("I'm object C");
        objC.getMessage();

        Prototype objD = (Prototype) context.getBean("prototype");
        objD.getMessage();

        Prototype objE = (Prototype) context.getBean("prototype");
        objE.getMessage();

        Prototype objF = (Prototype) context.getBean("prototype");
        objF.getMessage();


    }
}
