package com.oasys.dynamodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oasys.dynamodb.entity.Office;
import com.oasys.dynamodb.repository.Employeerepo;
@RestController
@RequestMapping("office")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

public class Employeecontroller {

	@Autowired Employeerepo employeerepo;
	

    @PostMapping("/insertdata")
    public Office saveEmployee(@RequestBody Office employee) {
        return employeerepo.save(employee);
    }
    @GetMapping("/get/{id}")
    public Office getEmployee(@PathVariable("id") String id) {
        return employeerepo.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Office deleteEmployee(@PathVariable("id") String employeeId) {
        return  employeerepo.delete(employeeId);
    }

    @PutMapping("/update/{id}")
    public Office updateEmployee(@PathVariable("id") String id, @RequestBody Office employee) {
        return employeerepo.update(id,employee);
    }
    
    @GetMapping("/getall")
    public List<Office> getalloffice(){
    	return employeerepo.getAllOffices();
    }
    
}
