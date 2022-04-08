package com.codegym.demospringboot.service.product;

import com.codegym.demospringboot.model.entity.Product;
import com.codegym.demospringboot.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;


    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void removeById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findProductByNameContaining(String name) {
        return productRepository.findByNameContaining(name);
    }

    @Override
    public Iterable<Product> findProductPriceBetween(Double min, Double max) {
        return productRepository.findProductPriceBetween(min, max);
    }
}
