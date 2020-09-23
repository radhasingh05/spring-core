package com.radha;

public class BeanA {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("BeanA is going through init.");
    }
    public void destroy() {
        System.out.println("BeanA will destroy now.");
    }
}
