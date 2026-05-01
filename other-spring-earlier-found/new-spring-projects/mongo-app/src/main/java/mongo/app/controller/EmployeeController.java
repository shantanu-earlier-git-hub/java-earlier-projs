package mongo.app.controller;


import lombok.AllArgsConstructor;
import mongo.app.entity.employee.Employee;
import mongo.app.models.EmpModel;
import mongo.app.models.Response;
import mongo.app.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emp")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<Response> findAll() {

        List<Employee> empList= employeeService.findAll();

        Response response = new Response();
        response.setReturnObject(empList);
        response.setError(null);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("found " + empList.size() + " employees");

        return new ResponseEntity<>(response, HttpStatus.OK);

    }


    @PostMapping("/new")
    public ResponseEntity<Response> createNew(@RequestBody EmpModel empModel) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Employee emp = modelMapper.map(empModel, Employee.class);

        emp = employeeService.createEmployeeRecord(emp);

        Response response = new Response();
        response.setReturnObject(emp);
        response.setError(null);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("new Employee " + emp.getName() + " has been created");

        return new ResponseEntity<>(response, HttpStatus.OK);


    }


}
