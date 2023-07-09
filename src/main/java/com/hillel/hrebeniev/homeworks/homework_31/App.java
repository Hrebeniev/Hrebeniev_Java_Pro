package com.hillel.hrebeniev.homeworks.homework_31;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ConsoleShoppingCartApp consoleApp = context.getBean(ConsoleShoppingCartApp.class);
        consoleApp.run();

        context.close();
    }
}