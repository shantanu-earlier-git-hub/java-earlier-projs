package bootjpa.practise1.web;

import bootjpa.practise1.entities.onetoone.Employee;
import bootjpa.practise1.repositories.EmployeeRepository;
import bootjpa.practise1.shared.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Response> getAll() {
        var response = new Response();
        ResponseEntity<Response> responseEntity = null;
        try {
            response.setData(this.employeeRepository.findAll());
            response.setMessage("success");
            responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setData(null);
            response.setMessage("error");
            responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Response> fetchById(@PathVariable Long id) {
        var response = new Response();
        ResponseEntity<Response> responseEntity = null;
        try {
            var emp = this.employeeRepository.findById(id);
            System.out.println(emp);
            response.setData(emp);
            response.setMessage("success");
            responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setData(null);
            response.setMessage("error");
            responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }


    @Transactional
    @PostMapping("/new")
    public ResponseEntity<Response> create(@RequestBody Employee employee) {
        var response = new Response();
        ResponseEntity<Response> responseEntity = null;
        System.out.println(employee);
        try {
            var emp = this.employeeRepository.save(employee);
            response.setData(emp);
            response.setMessage("success");
            responseEntity = new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e);
            response.setMessage("error");
            responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;

    }

    @PutMapping("/update")
    public void update(@RequestBody Employee employee) {
        this.employeeRepository.save(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@RequestParam Long id) {
        this.employeeRepository.deleteById(id);
    }

}
