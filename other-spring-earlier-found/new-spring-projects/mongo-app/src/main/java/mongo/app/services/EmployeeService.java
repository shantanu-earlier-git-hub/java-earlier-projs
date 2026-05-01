package mongo.app.services;


import lombok.AllArgsConstructor;
import mongo.app.entity.employee.Employee;
import mongo.app.repository.EmployeeRepository;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Transactional(readOnly = true)
    public List<Employee> findAll() {

        Query query = new Query();
        return employeeRepository.findAll();
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Employee createEmployeeRecord(Employee emp) {
        return employeeRepository.insert(emp);

    }



}
