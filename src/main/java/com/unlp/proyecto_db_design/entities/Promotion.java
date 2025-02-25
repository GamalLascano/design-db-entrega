package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Promotion {
    private String code;
    private String promotionTitle;
    private String nameStore;
    private String cuitStore;
    private Date validityStartDate;
    private Date validityEndDate;
    private String comments;
}
