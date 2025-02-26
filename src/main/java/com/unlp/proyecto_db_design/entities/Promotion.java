package com.unlp.proyecto_db_design.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "promotion_type",
        discriminatorType = DiscriminatorType.STRING
)
@Data
public class Promotion {
    @Id
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
