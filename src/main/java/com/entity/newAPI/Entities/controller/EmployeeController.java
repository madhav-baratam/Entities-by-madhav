package com.entity.newAPI.Entities.controller;

import com.entity.newAPI.Entities.entity.Employee;
import com.entity.newAPI.Entities.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository empRepository;

  /*  @PostMapping(value ="/saveEmp")
    public ResponseEntity<String > saveEmp(@RequestBody List<Employee> empData){
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data Saved");
    }
*/
    @GetMapping(value = "/getEmp")
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }
}
