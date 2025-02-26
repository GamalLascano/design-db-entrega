package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "purchase_type",
        discriminatorType = DiscriminatorType.STRING
)
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
