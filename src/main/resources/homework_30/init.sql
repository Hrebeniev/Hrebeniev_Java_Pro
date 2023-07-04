CREATE DATABASE homework30;
USE homework30;

CREATE TABLE students (
  id            INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name          VARCHAR(255)    NOT NULL,
  email         VARCHAR(255)    NOT NULL
);


CREATE USER "username"@"localhost" IDENTIFIED BY "password";
GRANT CREATE, DELETE, INSERT, SELECT, DROP ON homework30.students TO "username"@"localhost";