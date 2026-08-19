package devhabil.employeeservice.service;

import devhabil.employeeservice.dto.ApiResponseDto;
import devhabil.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long employeeId);
}
