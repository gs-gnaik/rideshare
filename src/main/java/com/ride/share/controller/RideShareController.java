package com.ride.share.controller;

import com.ride.share.data.Employee;
import com.ride.share.data.Location;
import com.ride.share.service.EmployeeServiceImpl;
import com.ride.share.service.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gnaik on 18/04/17.
 */
@RequestMapping("rideshare")
@RestController
public class RideShareController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    LocationServiceImpl locationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getStarted(){
        return "Hey! Welcome to Ride Share App. Here, you can pass tokens and get details";
    }

    @RequestMapping(value="/event", method = RequestMethod.POST)
    public Object eventFromSlack(@RequestBody Object data){
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        if(data instanceof Map){
            Map map1 = (Map) data;
            map.put("challenge", map1.get("challenge"));
        }
        return map;
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public List<Location> getAllLocations(){
        return locationService.findAll();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @RequestMapping(value = "/location", method= RequestMethod.POST)
    public Object createLocation(@RequestBody Location location) {
        locationService.save(location);
        return new HashMap<String, String>().put("success", "true");
    }

    @RequestMapping(value = "/employee", method= RequestMethod.POST)
    public Map createEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        return map;
    }

    @RequestMapping(value="/location/{id}", method=RequestMethod.DELETE)
    public Map deleteLocation(@PathVariable String id) {
        locationService.delete(id);
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        return map;
    }

    @RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
    public Map deleteEmployee(@PathVariable String id) {
        employeeService.delete(id);
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        return map;
    }

    @RequestMapping(method=RequestMethod.PUT, value="/location/{id}")
    public Map updateLocation(@PathVariable String id, @RequestBody Location location) {
        locationService.update(location);
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        return map;
    }

    @RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
    public Map updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        employeeService.update(employee);
        Map map = new HashMap<String, String>();
        map.put("success", "true");
        return map;
    }
}
