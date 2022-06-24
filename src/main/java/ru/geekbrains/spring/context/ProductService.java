package ru.geekbrains.spring.context;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.repository = productRepository;
    }


    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findProductById(long id){
        return repository.getProduct(id);
    }



}
