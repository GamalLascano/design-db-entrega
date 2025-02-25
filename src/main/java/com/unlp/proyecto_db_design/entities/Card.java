package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Card {
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
}
