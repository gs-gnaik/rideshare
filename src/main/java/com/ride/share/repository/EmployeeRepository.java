package com.ride.share.repository;

import com.mongodb.WriteResult;
import com.ride.share.data.Employee;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee location);

    public Employee getEmployee(String id);

    public WriteResult updateEmployee(String id, String name);

    public void deleteEmployee(String id);
}
