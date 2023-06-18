INSERT INTO Homework (name, description) VALUES
('Math Homework', 'Complete exercises 4 on page 22.'),
('English Homework', 'Read the text and answer the questions.'),
('Science Homework', 'Write a one-page summary on the process of photosynthesis.');

INSERT INTO Lesson (name, updatedAt, homework_id) VALUES
('Math Lesson 1', '2023-05-12 12:30:00', 1),
('English Lesson 1', '2023-06-12 11:00:00', 2),
('Science Lesson 1', '2023-05-15 05:15:00', 3);

INSERT INTO Schedule (name, updatedAt) VALUES
('Monday Schedule', '2023-05-08 12:00:00'),
('Tuesday Schedule', '2023-05-11 12:00:00'),
('Wednesday Schedule', '2023-05-10 12:00:00');

INSERT INTO Lesson_Schedule (lesson_id, schedule_id) VALUES
(1, 1),
(2, 1),
(3, 2),
(1, 3),
(2, 3);