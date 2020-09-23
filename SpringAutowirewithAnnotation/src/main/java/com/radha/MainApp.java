package com.radha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* * Autowire annotation can be added to Property
 * or setter method
 * or on Constructor method
 * */

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.radha");
        context.refresh();
        Employee employee =  context.getBean(Employee.class);
        employee.setEmpId(100);
        employee.setEmpName("Radha Singh");
        employee.showEmployeeDetails();

        context.close();

    }
}
