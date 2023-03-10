package ru.ngs.summerjob.spring_data_rest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ngs.summerjob.spring_data_rest.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByNameIgnoreCase(String name);
}
