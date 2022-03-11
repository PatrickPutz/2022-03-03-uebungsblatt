package org.campus02.employee;

public class Employee implements Comparable<Employee> // Comparable -> Default Sortierung
{

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

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getFullSalary(){
        return this.baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // -1 -> kleiner
        // 0 -> ident
        // +1 -> größer

        /*
        if(getFullSalary() > o.getFullSalary())
            return 1;
        if(getFullSalary() < o.getFullSalary())
            return -1;

        return 0;
         */

        if(lastname.compareTo(o.lastname) == 0){
            return firstname.compareTo(o.firstname);
        }
        else
            return lastname.compareTo(o.lastname);

    }
}
