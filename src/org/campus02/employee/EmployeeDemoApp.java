package org.campus02.employee;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeDemoApp {

    public static void main(String[] args) {

        Employee karl = new Employee("Corona", "Zabusa", "IT", 2500.00);
        Employee max = new Employee("Mustermann", "Max", "Finance", 3000.00);
        Employee susi = new Employee("Sorglos", "Susi", "HR", 2800.00);

        FixCommissionEmployee klaus = new FixCommissionEmployee("Corona", "Klaus", "HR", 3000.00, 500.00);
        FixCommissionEmployee maria = new FixCommissionEmployee("Mustermann", "Maria", "IT", 2700.00, 800.00);

        PercentCommissionEmployee rene = new PercentCommissionEmployee("Mustermann", "Rene", "Finance", 3000.00, 10.00);
        PercentCommissionEmployee werner = new PercentCommissionEmployee("Wohlauf", "Werner", "IT", 3000.00, 20.00);

        EmployeeManager employees = new EmployeeManager();

        employees.addEmployee(karl);
        employees.addEmployee(max);
        employees.addEmployee(susi);
        employees.addEmployee(klaus);
        employees.addEmployee(maria);
        employees.addEmployee(rene);
        employees.addEmployee(werner);

        System.out.println("<<< Employees >>>");
        System.out.println("Karl: " + karl.getFullSalary());
        System.out.println("Max: " + max.getFullSalary());
        System.out.println("Susi: " + susi.getFullSalary());
        System.out.println("Klaus: " + klaus.getFullSalary());
        System.out.println("Maria: " + maria.getFullSalary());
        System.out.println("Rene: " + rene.getFullSalary());
        System.out.println("Werner: " + werner.getFullSalary());
        System.out.println("");

        System.out.println("<<< Employee Manager >>>");
        System.out.println("Total Salary: " + employees.calcTotalSalary());
        System.out.println("Total Salary by Department: ");

        HashMap<String, Double> byDepartment = employees.getSalaryByDepartment();

        for (Map.Entry<String, Double> stringDoubleEntry : byDepartment.entrySet()) {
            System.out.println(stringDoubleEntry);
        }
        System.out.println("");
        System.out.println("");

        System.out.println("<<< Sorting >>>");

        Employee[] employeeArray = {susi, karl, max, klaus, maria, rene, werner};
        System.out.println("Array.toString(employeeArray) = " + Arrays.toString(employeeArray));

        Arrays.sort(employeeArray);
        System.out.println("Array.toString(employeeArray) = " + Arrays.toString(employeeArray));

        ArrayList<Employee> ee = new ArrayList<>();
        ee.add(susi);
        ee.add(karl);
        ee.add(max);
        ee.add(klaus);
        ee.add(maria);

        System.out.println("ee = " + ee);
        Collections.sort(ee);
        System.out.println("ee = " + ee);
    }

}
