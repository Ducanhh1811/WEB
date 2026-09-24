/* USERS */

INSERT INTO Users
(username, password, fullName, email, role)
VALUES
('admin', '123456', N'Administrator', 'admin@gmail.com', 'ADMIN'),
('anh', '123456', N'Nguyen Duc Anh', 'anh@gmail.com', 'USER');
GO


/* GAME GENRES */

INSERT INTO Genres (genreName)
VALUES
(N'RPG'),
(N'Action'),
(N'Adventure'),
(N'Strategy'),
(N'Simulation'),
(N'Horror'),
(N'Sports'),
(N'Shooter');
GO


/* GAMES */

INSERT INTO Games
(gameName, description, image, developer, releaseDate, genreID)
VALUES
(N'Genshin Impact',
 N'Open-world action RPG.',
 'genshin.jpg',
 N'HoYoverse',
 '2020-09-28',
 1),

(N'Wuthering Waves',
 N'Open-world action RPG with fast combat.',
 'wuwa.jpg',
 N'Kuro Games',
 '2024-05-22',
 1),

(N'Minecraft',
 N'Sandbox game about building and exploration.',
 'minecraft.jpg',
 N'Mojang Studios',
 '2011-11-18',
 3),

(N'Counter-Strike 2',
 N'Competitive tactical shooter.',
 'cs2.jpg',
 N'Valve',
 '2023-09-27',
 8);
GO


/* MOVIE CATEGORIES */

INSERT INTO MovieCategories (categoryName)
VALUES
(N'Action'),
(N'Comedy'),
(N'Horror'),
(N'Sci-Fi'),
(N'Animation'),
(N'Drama');
GO


/* MOVIES */

INSERT INTO Movies
(movieName, description, image, director, releaseDate, categoryID)
VALUES
(N'Interstellar',
 N'A science fiction movie about space exploration.',
 'interstellar.jpg',
 N'Christopher Nolan',
 '2014-11-07',
 4),

(N'Your Name',
 N'Japanese animated romantic fantasy movie.',
 'yourname.jpg',
 N'Makoto Shinkai',
 '2016-08-26',
 5);
GO


/* FOOD CATEGORIES */

INSERT INTO FoodCategories (categoryName)
VALUES
(N'Vietnamese Food'),
(N'Fast Food'),
(N'Dessert'),
(N'Drink'),
(N'Japanese Food'),
(N'Korean Food');
GO


/* FOODS */

INSERT INTO Foods
(foodName, description, image, price, categoryID)
VALUES
(N'Pho Bo',
 N'Vietnamese beef noodle soup.',
 'pho.jpg',
 50000,
 1),

(N'Banh Mi',
 N'Vietnamese baguette sandwich.',
 'banhmi.jpg',
 30000,
 1),

(N'Ramen',
 N'Japanese noodle soup.',
 'ramen.jpg',
 80000,
 5);
GO


/* SUBJECTS */

INSERT INTO Subjects
(userID, subjectName, description)
VALUES
(2, N'PRJ301', N'Java Web Application Development'),
(2, N'DBI202', N'Database'),
(2, N'CSD', N'Data Structures');
GO


/* NOTES */

INSERT INTO Notes
(userID, subjectID, title, content)
VALUES
(2, 1, N'Servlet Basic',
 N'Servlet receives request and returns response.'),

(2, 2, N'SQL JOIN',
 N'JOIN is used to combine data from multiple tables.');
GO


/* ASSIGNMENTS */

INSERT INTO Assignments
(userID, subjectID, title, description, dueDate, status)
VALUES
(2, 1,
 N'Personal Web Project',
 N'Build a personal website using Java Servlet.',
 '2026-10-01',
 'In Progress'),

(2, 3,
 N'Linked List Assignment',
 N'Implement a sale management system.',
 '2026-09-30',
 'Pending');
GO


/* FINANCE CATEGORIES */

INSERT INTO FinanceCategories
(categoryName, type)
VALUES
(N'Salary', 'INCOME'),
(N'Food', 'EXPENSE'),
(N'Gaming', 'EXPENSE'),
(N'Transport', 'EXPENSE'),
(N'Education', 'EXPENSE'),
(N'Other Income', 'INCOME');
GO


/* TRANSACTIONS */

INSERT INTO Transactions
(userID, categoryID, amount, description)
VALUES
(2, 1, 5000000, N'Monthly income'),
(2, 2, 50000, N'Pho'),
(2, 3, 200000, N'Game purchase'),
(2, 4, 50000, N'Bus');
GO


/* SCHEDULE */

INSERT INTO Schedules
(userID, title, description, startTime, endTime, location)
VALUES
(2,
 N'PRJ301 Class',
 N'Java Web Programming',
 '2026-09-25 12:50:00',
 '2026-09-25 17:30:00',
 N'University');
GO


/* PROJECT CATEGORIES */

INSERT INTO ProjectCategories (categoryName)
VALUES
(N'Java'),
(N'Web'),
(N'Database'),
(N'Frontend'),
(N'Personal');
GO


/* PROJECTS */

INSERT INTO Projects
(userID, categoryID, projectName, description,
 githubLink, demoLink, startDate, status)
VALUES
(2,
 1,
 N'Personal Hub',
 N'Personal website built with Java Servlet, JSP and SQL Server.',
 'https://github.com/',
 NULL,
 '2026-09-24',
 'In Progress');
GO