package com.entity.newAPI.Entities.repository;

import com.entity.newAPI.Entities.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
