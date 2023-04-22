package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(long id);
    boolean save(Employee employee);
    boolean update(Employee employee);
    boolean delete(long id);
}
