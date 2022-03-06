package org.campus02.employee;

public class FixCommissionEmployee extends Employee {

    private double additionalCommssion;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommssion) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommssion = additionalCommssion;
    }

    @Override
    public double getFullSalary() {
        return this.baseSalary + this.additionalCommssion;
    }
}
