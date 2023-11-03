package com.mockitoStudy.service;

import com.mockitoStudy.dao.EmployeeDAO;
import com.mockitoStudy.dao.EmployeeDAOImpl;
import com.mockitoStudy.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @Override
    public void createEmployee(Employee employee) {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee fetchEmployeeById(Integer employeeId) {
        return employeeDAO.getEmployeeById(employeeId);
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
        employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeDAO.deleteEmployeeById(employeeId);
    }

    @Override
    public List<Employee> fetchAllEmployeesInfo() {
        return employeeDAO.getAllEmployeesInfo();
    }
}
