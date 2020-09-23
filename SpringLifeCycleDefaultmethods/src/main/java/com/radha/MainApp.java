package com.radha;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        BeanOne beanOne = (BeanOne) context.getBean("beanone");
        BeanTwo beanTwo = (BeanTwo) context.getBean("beantwo");
        BeanThree beanThree = (BeanThree) context.getBean("beanthree");
        beanOne.getMessage();
        beanTwo.getMessage();
        beanThree.getMessage();
        context.registerShutdownHook();
    }
}
