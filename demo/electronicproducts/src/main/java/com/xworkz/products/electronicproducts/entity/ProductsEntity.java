package com.xworkz.products.electronicproducts.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products_Table")
public class ProductsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item")
    private String itemName;

    @Column(name = "price")
    private Double price;

    @Column(name = "Brand")
    private String brand;

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
