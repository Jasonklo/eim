package com.infosys.timetracker.eim.repository;



import com.infosys.timetracker.eim.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    Optional<Employee> findByEmpName(String empName);

}
