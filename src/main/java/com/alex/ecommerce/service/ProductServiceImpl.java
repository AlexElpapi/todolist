package com.alex.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.ecommerce.model.Product;
import com.alex.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl extends ProductService {
    
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Long id, Product updateProduct){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setName(updateProduct.getName());
            product.setPrice(updateProduct.getPrice());
            product.setQuantity(updateProduct.getQuantity());
            product.setImageUrl(updateProduct.getImageUrl());
            return productRepository.save(product);
        }else{
            throw new RuntimeException("Prodotto non trovato con id "+id);
        }
    }
    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
