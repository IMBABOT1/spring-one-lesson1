package ru.geekbrains.spring.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Product {
    private Long id;
    private String name;
    private int price;

    public Product(){

    }

    public Product(Long id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public long getPrice(){
        return price;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }



    @Override
    public String toString() {
        return "[id: " + id + ", " + "name: " + name + ", " + "price: " + price + "]";
    }
}
