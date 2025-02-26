package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Purchase {
    private String paymentVoucher;
    private String store;
    private String cuitStore;
    private float amount;
    private float finalAmount;
    @OneToOne
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    private Card card;
    @OneToOne
    private Promotion validPromotion;
}
