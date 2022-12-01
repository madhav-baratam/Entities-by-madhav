package com.entity.newAPI.Entities.entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    @Column
    private String empName;
    @Column
    private Integer empAge;
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

  /* public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    //address_add_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")

    private Address address;*/
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")*/
}
