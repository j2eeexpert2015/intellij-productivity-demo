package lfe.sample.repository;

import lfe.sample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD Database methods
}


