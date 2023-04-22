package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Employee;
import mx.edu.utez.recuperacion.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public boolean save(Employee employee) {
        try {
            employeeRepository.save(employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Employee employee) {
        try {
            employeeRepository.save(employee);
            return true;
        } catch (Exception e) {
            return false;
        }


    }   @Override
    public boolean delete(long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
