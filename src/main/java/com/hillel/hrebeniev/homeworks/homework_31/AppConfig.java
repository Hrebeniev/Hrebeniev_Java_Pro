package com.hillel.hrebeniev.homeworks.homework_31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    public Cart cart() {
        return new Cart();
    }

    @Bean
    public ShoppingCartApp shoppingCartApp(ProductRepository productRepository, Cart cart) {
        return new ShoppingCartApp(productRepository, cart);
    }

    @Bean
    public ConsoleShoppingCartApp consoleShoppingCartApp(ShoppingCartApp shoppingCartApp) {
        return new ConsoleShoppingCartApp(shoppingCartApp);
    }
}