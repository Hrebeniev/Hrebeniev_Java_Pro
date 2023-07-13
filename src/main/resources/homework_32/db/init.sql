CREATE DATABASE homework31;
USE homework31;


CREATE TABLE products (
    id          INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(255)    NOT NULL,
    price       DECIMAL(10, 2)  NOT NULL
);

CREATE TABLE carts (
    id          INT             NOT NULL PRIMARY KEY AUTO_INCREMENT
    );

    CREATE TABLE carts_products (
        card_id          INT        NOT NULL,
        product_id       INT        NOT NULL,
        FOREIGN KEY (card_id)    REFERENCES carts(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);


CREATE USER "username"@"localhost" IDENTIFIED BY "password";
GRANT CREATE, REFERENCES, SELECT, UPDATE, DELETE, INSERT, DROP ON products TO "username"@"localhost";
GRANT CREATE, REFERENCES, SELECT, UPDATE, DELETE, INSERT, DROP ON carts TO "username"@"localhost";
GRANT CREATE, REFERENCES, SELECT, UPDATE, DELETE, INSERT, DROP ON carts_products TO "username"@"localhost";

