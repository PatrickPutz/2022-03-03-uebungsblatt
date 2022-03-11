package org.campus02.employee;

import java.util.Comparator;

public class EmployeeFirstNameSort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }

}
