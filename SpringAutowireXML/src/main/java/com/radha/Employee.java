package com.radha;

public class Employee {
    private Integer eid;
    private String ename;
    private Department department;

    public Employee() {
    }

    public Employee(Department department) {
        this.department = department;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showEmployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        System.out.println("Department : " + department.getDeptName());

    }
}
