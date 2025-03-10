package com.xworkz.products.electronicproducts.controller;
import com.xworkz.products.electronicproducts.dto.ProductDto;
import com.xworkz.products.electronicproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public String saveProducts(Model model , ProductDto dto) {
        boolean saveproduct = productService.saveproducts(dto);
        if (saveproduct)
            model.addAttribute("products", "productsavedsuccessfully");
        return "products";
    }

}