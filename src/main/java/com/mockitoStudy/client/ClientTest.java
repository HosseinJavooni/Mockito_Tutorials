package com.mockitoStudy.client;

import com.mockitoStudy.model.Employee;
import com.mockitoStudy.service.EmployeeService;
import com.mockitoStudy.service.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;

public class ClientTest {
    public static void main(String[] args) {
        EmployeeService empoyeeService = new EmployeeServiceImpl();

        Employee employee = getEmployee();
        //empoyeeService.createEmployee(employee);
        //getEmployeeById(empoyeeService);
        //empoyeeService.updateEmployeeEmailById("sean.cs2020@gmail.com", 3);
        //empoyeeService.deleteEmployeeById(4);
        getAllEmployeesInfo(empoyeeService);
    }

    private static void getAllEmployeesInfo(EmployeeService empoyeeService) {
        List<Employee> empList = empoyeeService.fetchAllEmployeesInfo();
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }

    private static void getEmployeeById(EmployeeService empoyeeService) {
        Employee employee2 = empoyeeService.fetchEmployeeById(1);
        if(employee2 != null){
            System.out.println(employee2);
        }else{
            System.out.println("Employee does not exist..");
        }
    }

    private static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setBonus(new BigDecimal(600));
        employee.setDoj(new Date());
        employee.setEmployeeName("KK");
        employee.setEmail("kk.cs2016@yahoo.com");
        employee.setSalary(50000.00000);
        return employee;
    }
}
