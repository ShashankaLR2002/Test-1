package com.xworkz.crud.demo.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ProductDTO {
    private String itemName;
    private double price;
    private String brand;
    private String createdBy;
    private LocalDate createdOn;
    private String updatedBy;
    private LocalDate updatedOn;
    private boolean isActive = true;
}
