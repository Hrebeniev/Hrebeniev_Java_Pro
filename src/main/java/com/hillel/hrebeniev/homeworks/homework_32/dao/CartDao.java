package com.hillel.hrebeniev.homeworks.homework_32.dao;

import com.hillel.hrebeniev.homeworks.homework_32.Cart;
import com.hillel.hrebeniev.homeworks.homework_32.CartMapper;
import com.hillel.hrebeniev.homeworks.homework_32.ProductMapper;
import com.hillel.hrebeniev.homeworks.homework_32.TableName;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Log4j2
@Value
@Repository
public class CartDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public void addCart() {
        String query = String.format("INSERT INTO %s VALUES ()", TableName.carts);
        log.info(query);
        jdbcTemplate.update(query);
    }

    public void deleteCart(int cartId) {
        String query = String.format("DELETE FROM %s WHERE id = ?", TableName.carts);
        log.info(query);
        jdbcTemplate.update(query, cartId);
    }

    public Cart getCartById(int cartId) {
        String query =
                String.format("SELECT * FROM %s c JOIN %s p ON c.product_id = p.id WHERE c.card_id = ?",
                        TableName.carts_products, TableName.products);
        log.info(query);
        return jdbcTemplate.queryForObject(query, new CartMapper(new ProductMapper()), cartId);
    }

    public void addToCart(int cartId, int productId) {
        String query = String.format("INSERT INTO %s (card_id, product_id) VALUES (?, ?)",
                TableName.carts_products);
        log.info(query);
        jdbcTemplate.update(query, cartId, productId);
    }

    public void removeFromCart(int cartId, int productId) {
        String query =
                String.format("DELETE FROM %s WHERE card_id = (?) AND product_id = (?)",
                        TableName.carts_products);
        log.info(query);
        jdbcTemplate.update(query, cartId, productId);
    }
}