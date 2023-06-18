CREATE DATABASE homework24;
USE homework24;

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

CREATE TABLE Schedule (
  id            INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name          VARCHAR(255)    NOT NULL,
  updatedAt     TIMESTAMP       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Lesson_Schedule (
  lesson_id     INT             NOT NULL,
  schedule_id   INT             NOT NULL,
  PRIMARY KEY (lesson_id, schedule_id),
  FOREIGN KEY (lesson_id) REFERENCES Lesson(id),
  FOREIGN KEY (schedule_id) REFERENCES Schedule(id)
);