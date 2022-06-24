package ru.geekbrains.spring.context;

public class Product {
    private long id;
    private String name;
    private long price;

    public Product(){

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

    public void setPrice(long price){
        this.price = price;
    }

    private Product(long id, String name, long price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
