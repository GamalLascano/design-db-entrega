package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("Single")
@Data
public class PurchaseSinglePayment extends Purchase{
    private float storeDiscount;
}
