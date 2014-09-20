package demo.controller;

import demo.data.EmployeeRepository;
import demo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @RequestMapping("")
    public List<Employee> findEmployee(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name != null) {
            return repository.findByName(name);
        } else if (title != null) {
            return repository.findByTitle(title);
        } else {
            return repository.findAll();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable String id) {
        repository.delete(id);
    }
}