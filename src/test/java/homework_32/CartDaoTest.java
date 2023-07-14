package homework_32;

import com.hillel.hrebeniev.homeworks.homework_32.TableName;
import com.hillel.hrebeniev.homeworks.homework_32.config.JdbcConfig;
import com.hillel.hrebeniev.homeworks.homework_32.dao.CartDao;
import com.hillel.hrebeniev.homeworks.homework_32.dao.ProductDao;
import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CartDaoTest {

    private static AnnotationConfigApplicationContext context;
    private static CartDao cartDao;
    private static ProductDao productDao;

    @BeforeAll
    static void setUp() {
        context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        cartDao = context.getBean(CartDao.class);
        productDao = context.getBean(ProductDao.class);
        String query1 = String.format(
                "CREATE TABLE %s (\n" +
                        "    card_id    INT    NOT NULL,\n" +
                        "    product_id INT    NOT NULL,\n" +
                        "    FOREIGN KEY (card_id)    REFERENCES carts(id),\n" +
                        "    FOREIGN KEY (product_id) REFERENCES products(id)\n" +
                        ");",
                TableName.carts_products);
        String query2 = String.format(
                "CREATE TABLE %s (\n" +
                        "    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT\n" +
                        ");",
                TableName.carts);
        String query3 = String.format(
                "CREATE TABLE %s (\n" +
                        "    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\n" +
                        "    name VARCHAR(255) NOT NULL,\n" +
                        "    price DECIMAL(10, 2) NOT NULL\n" +
                        ");",
                TableName.products);
        jdbcTemplate.update(query2);
        jdbcTemplate.update(query3);
        jdbcTemplate.update(query1);

        String query4 = String.format("INSERT INTO %s (name, price) VALUES (?, ?)", TableName.products);
        jdbcTemplate.update(query4, "ProductTest", "10.00");
    }

    @AfterAll
    static void cleanUp() {
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String query1 = String.format("DROP TABLE %s", TableName.carts_products);
        String query2 = String.format("DROP TABLE %s", TableName.carts);
        String query3 = String.format("DROP TABLE %s", TableName.products);
        jdbcTemplate.update(query1);
        jdbcTemplate.update(query2);
        jdbcTemplate.update(query3);
    }


    @Test
    @Order(1)
    void addCartTest() {
        cartDao.addCart();
    }

    @Test
    @Order(2)
    void deleteCartTest() {
        cartDao.addCart();
        cartDao.deleteCart(2);
    }

    @Test
    @Order(3)
    void addToCartTest() {
        cartDao.addToCart(1, 1);
    }

        @Test
        @Order(4)
        void getCartByIdTest () {
            cartDao.getCartById(1);
        }

        @Test
        @Order(5)
        void removeFromCart () {
            cartDao.removeFromCart(1, 1);
        }
    }