package com.radha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setEid(101);
        employee.setEname("Radha Singh");
        employee.showEmployeeDetails();
    }
}
