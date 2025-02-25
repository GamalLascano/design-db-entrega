package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class PaymentSummary {
    private String code;
    private String month;
    private String year;
    private Date firstExpiration;
    private Date secondExpiration;
    private float surchargePercentage;
    private float totalPrice;
}
