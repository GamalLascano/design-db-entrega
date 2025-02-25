package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Quota {
    private int number;
    private float price;
    private String month;
    private String year;
}
