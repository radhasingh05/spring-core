package com.radha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
        helloWorld.setMessage("HelloWorld !..... ");
        helloWorld.getMessage();

        Employee employee = (Employee) context.getBean(Employee.class);
        employee.setEmpId(1000);
        employee.setEmpName("Radha Singh");

        Department department = (Department) context.getBean(Department.class);
        department.setDeptName("Information Technology");
        employee.showEmployeeDetails();

    }
}
