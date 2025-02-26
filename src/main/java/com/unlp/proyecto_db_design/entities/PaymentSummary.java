package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
public class PaymentSummary {
    private Integer id;
    private String code;
    private String month;
    private String year;
    private Date firstExpiration;
    private Date secondExpiration;
    private float surchargePercentage;
    private float totalPrice;
    @OneToMany
    private List<Quota> quotasPayments;
    @OneToMany
    private List<Quota> cashPayments;
    @OneToOne
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    private Card card;
}
