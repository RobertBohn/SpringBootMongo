package demo.data;

import demo.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 9/18/14
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    public List<Employee> findByName(String name);
    public List<Employee> findByTitle(String title);
}