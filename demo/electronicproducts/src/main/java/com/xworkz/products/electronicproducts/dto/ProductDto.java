package com.xworkz.products.electronicproducts.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductDto {
    private String itemName;
    private double price;
    private String brand;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;
    private boolean isActive = true;

}
