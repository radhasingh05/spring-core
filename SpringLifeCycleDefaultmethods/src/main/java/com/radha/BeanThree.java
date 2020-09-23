package com.radha;

public class BeanThree {
    private String message ;

    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void inti(){
        System.out.println("inti method of Bean Three");
    }

    public void destroy(){
        System.out.println("destroy method of Bean Three");
    }
}
