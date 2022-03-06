package org.campus02.employee;

public class PercentCommissionEmployee extends Employee{

    private double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        return this.baseSalary + (this.baseSalary / 100.00 * this.percentCommission);
    }
}
