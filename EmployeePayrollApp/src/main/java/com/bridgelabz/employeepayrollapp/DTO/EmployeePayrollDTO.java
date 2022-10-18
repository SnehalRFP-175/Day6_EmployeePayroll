package com.bridgelabz.employeepayrollapp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


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
