package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Purchase {
    private String paymentVoucher;
    private String store;
    private String cuitStore;
    private float amount;
    private float finalAmount;
}
