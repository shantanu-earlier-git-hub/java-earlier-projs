package bootjpa.practise1.repositories;

import bootjpa.practise1.entities.onetoone.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
