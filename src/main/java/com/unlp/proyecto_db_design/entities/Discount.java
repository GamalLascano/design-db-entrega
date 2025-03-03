package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Discount extends Promotion{
    private float discountPercentage;
    private float priceCap;
    private boolean onlyCash;
}
