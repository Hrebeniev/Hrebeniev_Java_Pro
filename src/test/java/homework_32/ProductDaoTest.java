package homework_32;

import com.hillel.hrebeniev.homeworks.homework_32.Product;
import com.hillel.hrebeniev.homeworks.homework_32.TableName;
import com.hillel.hrebeniev.homeworks.homework_32.config.JdbcConfig;
import com.hillel.hrebeniev.homeworks.homework_32.dao.ProductDao;
import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductDaoTest {
    private static AnnotationConfigApplicationContext context;
    private static ProductDao productDao;

    @BeforeAll
    static void setUp() {
        context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
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

    @Order(1)
    @Test
    void addProductTest() {
        Product product1 = Product.builder()
                .name("Product1")
                .price(10.00)
                .build();

        productDao.addProduct(product1);
    }

    @Order(2)
    @Test
    void deleteProduct() {
        Product product2 = Product.builder()
                .name("Product2")
                .price(20.00)
                .build();
        productDao.addProduct(product2);

        productDao.deleteProduct(2);
    }

    @Order(3)
    @Test
    void getProductByIdTest() {
        Product product3 = Product.builder()
                .name("Product3")
                .price(30.00)
                .build();
        productDao.addProduct(product3);

        productDao.getProductById(3);
    }

    @Order(4)
    @Test
    void getAllProductsTest() {
        productDao.getAllProducts();
    }
}