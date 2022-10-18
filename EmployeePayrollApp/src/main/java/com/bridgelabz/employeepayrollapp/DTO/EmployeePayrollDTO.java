package com.bridgelabz.employeepayrollapp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

/*
Using Lombok insted of getter setter and All Parameterized Constructor
 */
@Data
@AllArgsConstructor
public class EmployeePayrollDTO {
    public String name;
    public long salary;

    @Override
    public String toString() {
        return "name = "+name +" salary = " + salary;
    }
}
