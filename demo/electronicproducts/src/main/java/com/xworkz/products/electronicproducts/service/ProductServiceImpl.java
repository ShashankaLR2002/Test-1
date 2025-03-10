package com.xworkz.products.electronicproducts.service;
import com.xworkz.products.electronicproducts.dto.ProductDto;
import com.xworkz.products.electronicproducts.entity.ProductsEntity;
import com.xworkz.products.electronicproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired

    ProductRepository repository;
    @Override
    public boolean saveproducts(ProductDto dto) {
        ProductsEntity entity = new ProductsEntity();
        entity.setItemName(dto.getItemName());
        entity.setBrand(dto.getBrand());
        entity.setPrice(dto.getPrice());
        entity.setCreatedBy(dto.getCreatedBy());
        entity.setCreatedOn(LocalDateTime.now());
        return repository.saveProducts(entity);

    }

}
