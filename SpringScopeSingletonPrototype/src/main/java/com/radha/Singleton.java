package com.radha;

public class Singleton {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("singleton : " + message);
    }
}
