package com.hillel.hrebeniev.homeworks.homework_25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    public void add(Lesson lesson) throws SQLException {
        String insert = "INSERT INTO lesson (name, homework_id) VALUES (?, ?)";

        try (Connection connection = DataSource.INSTANCE.getConnection();
             PreparedStatement statement = connection.prepareStatement(insert)) {

            statement.setString(1, lesson.getName());
            statement.setLong(2, lesson.getHomework().getId());

            statement.executeUpdate();
        }
    }

    public void delete(long id) throws SQLException {
        String delete = "DELETE FROM Lesson WHERE id = ?";

        try (Connection connection = DataSource.INSTANCE.getConnection();
             PreparedStatement statement = connection.prepareStatement(delete)) {

            statement.setLong(1, id);

            statement.executeUpdate();
        }
    }

    public List<Lesson> getAll() throws SQLException {
        String query =
                "SELECT Lesson.id, Lesson.name, Homework.id, Homework.name, Homework.description "
                        + "FROM Lesson "
                        + "JOIN Homework ON Lesson.homework_id = Homework.id";
        List<Lesson> lessons = new ArrayList<>();

        try (Connection connection = DataSource.INSTANCE.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                Lesson lesson =
                        Lesson.builder().id(resultSet.getLong("id")).name(resultSet.getString("name"))
                                .homework(Homework.builder().id(resultSet.getLong("id"))
                                        .name(resultSet.getString("name"))
                                        .description(resultSet.getString("description"))
                                        .build()).build();

                lessons.add(lesson);
            }
        }

        return lessons;
    }

    public Lesson get(long id) throws SQLException {
        String query =
                "SELECT Lesson.id, Lesson.name, Homework.id, Homework.name, Homework.description "
                        + "FROM Lesson "
                        + "JOIN Homework ON Lesson.homework_id = Homework.id";

        try (Connection connection = DataSource.INSTANCE.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                return Lesson.builder().id(resultSet.getLong("id")).name(resultSet.getString("name"))
                        .homework(Homework.builder().id(resultSet.getLong("id"))
                                .name(resultSet.getString("name"))
                                .description(resultSet.getString("description"))
                                .build()).build();
            }
        }
        return null;
    }
}