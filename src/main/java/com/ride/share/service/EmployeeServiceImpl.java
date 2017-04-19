package com.ride.share.service;

import com.ride.share.data.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
@Service
public class EmployeeServiceImpl implements RideShareService<Employee> {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee find(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Employee save(Employee object) {
        return null;
    }

    @Override
    public Employee update(Employee object) {
        return null;
    }
}
