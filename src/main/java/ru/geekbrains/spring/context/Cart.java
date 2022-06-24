package ru.geekbrains.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {


    private ProductService productService;
    private List<Product> products;


    @Autowired
    public Cart(ProductService productService){
        this.productService = productService;
    }
    @PostConstruct
    public void init(){
        products = new ArrayList<>();
    }


    public void addProduct(long id){
        products.add(productService.findProductById(id));
    }

    public void deleteProductById(long id){
        for (Product p : products){
            if (p.getId() == id){
                products.remove(p);
                break;
            }
        }
    }

    public List<Product> showAll(){
        return Collections.unmodifiableList(products);
    }
}
