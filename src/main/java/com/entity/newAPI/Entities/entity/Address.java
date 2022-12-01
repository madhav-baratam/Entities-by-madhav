package com.entity.newAPI.Entities.entity;

import jdk.jfr.DataAmount;


import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional

@Table(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressID;

    public Long getAddressID() {
        return addressID;
    }

    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }



    private String city;
    private String addressType;

   public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private Employee employee;

/*@OneToOne(mappedBy = "empId")
    @JoinColumn(name = "fk_emp_id")

    //@ManyToOne
    //@JoinColumn(name = "fk_emp_id")
    //private Employee employee;*/

    // for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //@JoinColumn(name = "emp_id")
    //private Employee employee;

   // @ManyToOne
    //@JoinColumn(name = "fk_emp_id")
    //private Employee employee;
}
