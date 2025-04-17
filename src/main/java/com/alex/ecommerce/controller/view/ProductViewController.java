package com.alex.ecommerce.controller.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alex.ecommerce.model.Product;
import com.alex.ecommerce.service.ProductService;

@Controller
public class ProductViewController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/view")
    public String viewProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products"; // sarà in templates/products.html
    }
}
