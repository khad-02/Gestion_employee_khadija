package ma.ensa.Gestion_Employee.repository;

import ma.ensa.Gestion_Employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    void deleteById(Long id);
}
