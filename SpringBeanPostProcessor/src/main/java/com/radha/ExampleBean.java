package com.radha;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ExampleBean implements BeanPostProcessor {
    private String message;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization Method Call "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization Method Call "+beanName);
        return bean;
    }

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        System.out.println("ExampleBean Inti method");
    }
    public void destroy(){
        System.out.println("ExampleBean destroy method");
    }



}
