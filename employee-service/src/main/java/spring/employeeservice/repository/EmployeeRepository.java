package spring.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
