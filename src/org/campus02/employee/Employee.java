package org.campus02.employee;

public class Employee {

    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return this.baseSalary;
    }

    public String getDepartment() {
        return department;
    }
}
