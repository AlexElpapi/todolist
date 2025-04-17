package com.alex.ecommerce.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.ecommerce.model.Product;
import com.alex.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    @PostMapping("/reset")
    public String resetDatabase() {
        productService.deleteAllProducts();

        productService.createProduct(new Product(
            "T-shirt", "Cotone classico", 19.99, 100, "/images/t-shirt.png.jpg"
        ));
        productService.createProduct(new Product(
            "Jeans", "Denim blu", 49.99, 50, "/images/jeans.png.jpg"
        ));
        productService.createProduct(new Product(
            "Scarpe", "Running shoes", 89.99, 30, "/images/shoes.png.jpg"
        ));

        return "Database resettato con successo ✅";
    }
}
