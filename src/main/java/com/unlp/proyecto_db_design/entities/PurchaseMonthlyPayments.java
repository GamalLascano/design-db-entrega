package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class PurchaseMonthlyPayments extends Purchase{
    private float interest;
    private int numberOfQuotas;
    @OneToMany(mappedBy="purchase")
    private List<Quota> quotas;
}
