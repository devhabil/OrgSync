package devhabil.departmentservice.service;

import devhabil.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto savedDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
