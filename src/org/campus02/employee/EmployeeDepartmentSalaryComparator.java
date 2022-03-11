package org.campus02.employee;

import java.util.Comparator;

public class EmployeeDepartmentSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getDepartment().compareTo(o2.getDepartment());
        if(result == 0){
            Double.compare(o2.getBaseSalary(), o2.getBaseSalary());
            /*
            if(o1.getBaseSalary() > o2.getBaseSalary())
                result = 1;
            else if(o1.getBaseSalary() < o2.getBaseSalary())
                result = -1;
             */
        }
        return result;
    }
}
