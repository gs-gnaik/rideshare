package com.ride.share.repository;

import com.mongodb.WriteResult;
import com.ride.share.data.Employee;
import com.ride.share.data.Location;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {

    MongoTemplate mongoTemplate;

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return mongoTemplate.findAll(Employee.class);
    }

    @Override
    public void saveEmployee(Employee employee) {
        mongoTemplate.insert(employee);
    }

    @Override
    public Employee getEmployee(String id) {
        return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)),
                Employee.class);
    }

    @Override
    public WriteResult updateEmployee(String id, String name) {
        return mongoTemplate.updateFirst(
                new Query(Criteria.where("id").is(id)),
                Update.update("name", name), Location.class);
    }

    @Override
    public void deleteEmployee(String id) {
        mongoTemplate
                .remove(new Query(Criteria.where("id").is(id)), Employee.class);
    }
}
