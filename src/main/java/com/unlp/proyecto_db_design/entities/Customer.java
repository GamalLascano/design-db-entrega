package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String completeName;
    private String dni;
    private String cuit;
    private String address;
    private String telephone;
    private Date entryDate;
    @ManyToMany
    @JoinTable(
            name = "customer_bank",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "bank_id")
    )
    private Set<Bank> banks;
}
