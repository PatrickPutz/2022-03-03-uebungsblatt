package org.campus02.employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public double calcTotalSalary(){
        double result = 0.0;

        for (Employee employee : employees) {
            result += employee.getFullSalary();
        }

        return result;
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }

    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> result = new HashMap<>();

        for (Employee employee : employees) {
            if(result.containsKey(employee.getDepartment())){
                double amount = result.get(employee.getDepartment()) + employee.getFullSalary();
                result.put(employee.getDepartment(), amount);
            }
            else{
                result.put(employee.getDepartment(), employee.getFullSalary());
            }
        }

        return result;
    }

}
