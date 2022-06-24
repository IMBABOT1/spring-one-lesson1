package ru.geekbrains.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean("cart", Cart.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press /show_all to view cart");
        System.out.println("Press /end to end session");
        System.out.println("Press /add1 to add Milk");
        System.out.println("Press /add2 to add Bread");
        System.out.println("Press /add3 to add Meat");
        System.out.println("Press /add4 to add Water");
        System.out.println("Press /add5 to add Cheese");
        System.out.println("Press /end to end session");
        System.out.println("Press /dell1 to delete Milk");
        System.out.println("Press /dell2 to delete Bread");
        System.out.println("Press /dell3 to delete Meat");
        System.out.println("Press /dell4 4 to delete Water");
        System.out.println("Press /dell5 to delete Cheese");

        while (true) {
            String s = scanner.next();
            if (s.equals("/show_all")) {
                System.out.println(cart.showAll());
            } else if (s.equals("/end")) {
                break;
            } else if (s.equals("/add1")) {
                cart.addProduct(1);
            } else if (s.equals("/add2")) {
                cart.addProduct(2);
            } else if (s.equals("/add3")) {
                cart.addProduct(3);
            } else if (s.equals("/add4")) {
                cart.addProduct(4);
            } else if (s.equals("/add5")) {
                cart.addProduct(5);
            } else if (s.equals("/dell1")) {
                cart.deleteProductById(1);
            } else if (s.equals("/dell2")) {
                cart.deleteProductById(2);
            } else if (s.equals("/dell3")) {
                cart.deleteProductById(3);
            } else if (s.equals("/dell4")) {
                cart.deleteProductById(4);
            } else if (s.equals("/dell5")) {
                cart.deleteProductById(5);
            }
        }
        context.close();
    }
}
