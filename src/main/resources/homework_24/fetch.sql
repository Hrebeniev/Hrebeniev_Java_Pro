SELECT * FROM Homework;

SELECT Lesson.*, Homework.name AS homework_name, Homework.description AS homework_description
FROM Lesson
INNER JOIN Homework ON Lesson.homework_id = Homework.id;

SELECT Lesson.*, Homework.name AS homework_name, Homework.description AS homework_description
FROM Lesson
INNER JOIN Homework ON Lesson.homework_id = Homework.id
ORDER BY Lesson.updatedAt DESC;

SELECT Schedule.*, Lesson.name AS lesson_name, Lesson.updatedAt AS lesson_updatedAt
FROM Schedule
INNER JOIN Lesson_Schedule ON Schedule.id = Lesson_Schedule.schedule_id
INNER JOIN Lesson ON Lesson_Schedule.lesson_id = Lesson.id;

SELECT Schedule.*, COUNT(Lesson_Schedule.lesson_id) AS lesson_count
FROM Schedule
LEFT JOIN Lesson_Schedule ON Schedule.id = Lesson_Schedule.schedule_id
GROUP BY Schedule.id;