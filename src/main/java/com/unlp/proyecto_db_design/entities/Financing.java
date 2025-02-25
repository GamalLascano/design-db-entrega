package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Financing extends Promotion{
    private int numberOfQuotas;
    private float interest;
}
