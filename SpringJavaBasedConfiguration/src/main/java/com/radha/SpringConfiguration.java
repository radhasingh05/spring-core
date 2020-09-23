package com.radha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public HelloWorld helloWorldBean(){
        return new HelloWorld();
    }

    @Bean
    public Department department(){
        return new Department();
    }

    @Bean
    public Employee employee(){
        return new Employee();
    }

}
