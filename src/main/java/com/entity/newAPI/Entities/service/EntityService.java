package com.entity.newAPI.Entities.service;

import com.entity.newAPI.Entities.entity.Address;
import com.entity.newAPI.Entities.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    private AddressRepository repository;

    public List<Address> saveAdd(List<Address> address){return repository.saveAll(address);}
    public List<Address> getAddress(){return repository.findAll();}
    public Address updateAdd(Address address){
        Address addAddress = repository.findById(address.getAddressID()).orElse(null);
        assert addAddress != null;
        addAddress.setAddressType(addAddress.getAddressType());
      //  addAddress.setAddressID(addAddress.getAddressID());
       // addAddress.setCity(addAddress.getCity());
        //addAddress.setEmployee(addAddress.getEmployee());
        return repository.save(addAddress);
    }
}
