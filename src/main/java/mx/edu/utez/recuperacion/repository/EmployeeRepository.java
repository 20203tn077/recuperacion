package mx.edu.utez.recuperacion.repository;

import mx.edu.utez.recuperacion.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
