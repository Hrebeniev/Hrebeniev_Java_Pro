CREATE DATABASE homework25;
USE homework25;

CREATE TABLE Homework (
  id            INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name          VARCHAR(255)    NOT NULL,
  description   TEXT            NOT NULL
);

CREATE TABLE Lesson (
  id            INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name          VARCHAR(255)    NOT NULL,
  updatedAt     TIMESTAMP       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  homework_id   INT             NOT NULL,
  FOREIGN KEY (homework_id) REFERENCES Homework(id)
);

CREATE USER "username"@"localhost" IDENTIFIED BY "password";

GRANT CREATE, DELETE, INSERT, SELECT ON homework TO "username"@"localhost";
GRANT CREATE, DELETE, INSERT, SELECT ON lesson TO "username"@"localhost";