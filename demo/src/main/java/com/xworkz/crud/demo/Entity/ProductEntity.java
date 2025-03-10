package com.xworkz.crud.demo.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products_Table")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item")
    private String itemName;

    @Column(name = "price")
    private Double price;

    @Column(name = "createdby")
    private String createdBy;

    @Column(name = "createdon")
    private LocalDateTime createdOn = LocalDateTime.now();

    @Column(name = "updatedBy")
    private String updatedBy;

    @Column(name = "updatedon")
    private LocalDateTime updatedOn = LocalDateTime.now();

    @Column(name = "isactive")
    private Boolean isActive = true;
}
