package com.alex.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alex.ecommerce.model.Product;
import com.alex.ecommerce.service.ProductService;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}
    @Bean 

    public CommandLineRunner initData(ProductService productService) { 

        return args -> { 

            productService.createProduct(new Product( 

                "T-shirt", "Cotone classico", 19.99, 100, "/images/t-shirt.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "T-shirt 2", "Cotone slim", 21.99, 80, "/images/t-shirt2.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "T-shirt 3", "Cotone oversize", 18.50, 120, "/images/t-shirt3.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Jeans", "Denim blu", 49.99, 50, "/images/jeans.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Jeans 2", "Denim nero", 51.99, 40, "/images/jeans2.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Jeans 3", "Slim fit", 45.00, 30, "/images/jeans3.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Scarpe", "Running shoes", 89.99, 30, "/images/shoes.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Scarpe 2", "Sneakers bianche", 74.99, 60, "/images/shoes2.png.jpg" 

            )); 

            productService.createProduct(new Product( 

                "Scarpe 3", "Scarponi trekking", 109.99, 25, "/images/shoes3.png.jpg" 

            )); 

        }; 

    } 

} 
    
	


