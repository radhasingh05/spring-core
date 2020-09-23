package com.radha;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) throws Exception  {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
        exampleBean.getMessage();
        context.registerShutdownHook();

    }
}
