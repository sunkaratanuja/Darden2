package spring.employeeservice.service;

import spring.employeeservice.dto.APIResponseDto;
import spring.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
