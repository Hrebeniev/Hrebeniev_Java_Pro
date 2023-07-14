package com.hillel.hrebeniev.homeworks.homework_32.dao;

import com.hillel.hrebeniev.homeworks.homework_32.Product;
import com.hillel.hrebeniev.homeworks.homework_32.ProductMapper;
import com.hillel.hrebeniev.homeworks.homework_32.TableName;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log4j2
@Value
@Repository
public class ProductDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addProduct(Product product) {
        String query = String.format("INSERT INTO %s (name, price) VALUES (?, ?)", TableName.products);
        log.info(query);
        jdbcTemplate.update(query, product.getName(), product.getPrice());
    }

    public void deleteProduct(int productId) {
        String query = String.format("DELETE FROM %s WHERE id = ?", TableName.products);
        log.info(query);
        jdbcTemplate.update(query, productId);
    }

    public Product getProductById(int productId) {
        String query = "SELECT * FROM " + TableName.products + " WHERE id = ?";
        log.info(query);
        return jdbcTemplate.queryForObject(query, new ProductMapper(), productId);
    }

    public List<Product> getAllProducts() {
        String query = "SELECT * FROM " + TableName.products;
        log.info(query);
        return jdbcTemplate.query(query, new ProductMapper());
    }
}