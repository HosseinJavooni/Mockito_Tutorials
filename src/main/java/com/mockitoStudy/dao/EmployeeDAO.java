package com.mockitoStudy.dao;

import com.mockitoStudy.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public abstract void createEmployee(Employee employee);
    public abstract Employee getEmployeeById(Integer employeeId);
    public abstract void updateEmployeeEmailById(String newEmail,Integer employeeId);
    public abstract void deleteEmployeeById(Integer employeeId);
    public abstract List<Employee> getAllEmployeesInfo();
}
