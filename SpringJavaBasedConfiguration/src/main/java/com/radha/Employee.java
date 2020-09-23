package com.radha;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Integer empId;
    private String empName;
    @Autowired
    private Department department;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showEmployeeDetails(){
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Department Name : "+department.getDeptName());
    }
}
