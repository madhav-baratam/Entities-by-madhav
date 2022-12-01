package com.entity.newAPI.Entities.controller;

import com.entity.newAPI.Entities.entity.Address;
import com.entity.newAPI.Entities.repository.AddressRepository;
import com.entity.newAPI.Entities.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
        @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EntityService service;

    @PostMapping("/saveAdd")
    public ResponseEntity<String> saveAdd(@RequestBody List<Address> addData) {
        addressRepository.saveAll(addData);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping(value = "/getAddress")
    public List<Address> getEmployees() {
        return service.getAddress();
    }

    @PutMapping(value = "/update/{addressID}")
    public Address updateAdd(@PathVariable("addressID") long addressID, @RequestBody Address address) {
        //Address updatedAdd= addressRepository.findById(addressID).get();
        //updatedAdd.setAddressID(address.getAddressID());
        //updatedAdd.setCity(address.getCity());
        //updatedAdd.setAddressType(address.getAddressType());
        //updatedAdd.setEmployee(address.getEmployee());
        //addressRepository.save(updatedAdd);
        return service.updateAdd(address);

    }
}
