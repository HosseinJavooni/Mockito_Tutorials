package com.mockitoStudy.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private int employee_id;
    private String employeeName;
    private String email;
    private Double salary;
    private Date doj;
    private BigDecimal bonus;

    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public BigDecimal getBonus() {
        return bonus;
    }
    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employeeName=" + employeeName + ", email=" + email
                + ", salary=" + salary + ", doj=" + doj + ", bonus=" + bonus + "]";
    }
}
