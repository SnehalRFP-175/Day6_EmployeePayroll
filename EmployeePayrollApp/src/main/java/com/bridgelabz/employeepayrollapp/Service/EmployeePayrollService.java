package com.bridgelabz.employeepayrollapp.Service;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Snehal" ,300000)));
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataByID(int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Snehal",30000));
        return employeePayrollList.get(empId-1);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(employeePayrollList.size()+1,employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataByID(empId);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empId-1,employeePayrollData);
        return employeePayrollData;
    }


    @Override
    public void deleteEmployeePayroll(int empId) {
        employeePayrollList.remove(empId-1);
    }
}
