package ru.geekbrains.spring.context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public void init(){
        products = new ArrayList<>(Arrays.asList());
    }

    public List getProducts(){
        return products;
    }

    public Product getProduct(long id){
        throw new UnsupportedOperationException();
    }
}
