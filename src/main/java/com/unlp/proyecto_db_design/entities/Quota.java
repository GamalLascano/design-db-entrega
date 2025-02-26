package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Quota {
    private Integer id;
    private int number;
    private float price;
    private String month;
    private String year;
    @OneToOne
    @JoinColumn(name = "purchase_id", referencedColumnName = "id")
    private PurchaseMonthlyPayments purchase;
}
