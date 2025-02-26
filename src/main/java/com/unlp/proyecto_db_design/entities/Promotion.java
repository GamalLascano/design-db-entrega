package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Promotion {
    private Integer id;
    private String code;
    private String promotionTitle;
    private String nameStore;
    private String cuitStore;
    private Date validityStartDate;
    private Date validityEndDate;
    private String comments;
    @OneToMany
    private List<Purchase> purchases;
}
