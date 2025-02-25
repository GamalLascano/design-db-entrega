package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String cuit;
    private String address;
    private String telephone;
    @ManyToMany(mappedBy = "banks")
    private Set<Customer> customers;
}
