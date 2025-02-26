package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class Card {
    @Id
    private Integer id;
    private String number;
    private String ccv;
    private String cardholderNameInCard;
    private Date since;
    private Date expirationDate;
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer cardholder;
    @OneToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    private Bank bank;
    @OneToMany(mappedBy="card")
    private Set<Purchase> purchases;
}
