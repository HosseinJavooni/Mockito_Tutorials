package com.mockitoStudy.service;

import com.mockitoStudy.model.Employee;

import java.util.List;

public interface EmployeeService {
    public abstract void createEmployee(Employee employee);
    public abstract Employee fetchEmployeeById(Integer employeeId);
    public abstract void updateEmployeeEmailById(String newEmail,Integer employeeId);
    public abstract void deleteEmployeeById(Integer employeeId);
    public abstract List<Employee> fetchAllEmployeesInfo();
}
