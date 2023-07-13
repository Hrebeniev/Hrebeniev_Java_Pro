package com.hillel.hrebeniev.homeworks.homework_32;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartMapper implements RowMapper<Cart> {

    private final ProductMapper productMapper;

    public CartMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cart cart = new Cart();
        cart.setId(rs.getInt("id"));

        // Fetch the products for the cart using product_id
        List<Product> products = new ArrayList<>();
        do {
            Product product = productMapper.mapRow(rs, rowNum);
            products.add(product);
        } while (rs.next() && cart.getId() == rs.getInt("id"));

        cart.setProducts(products);

        return cart;
    }
}