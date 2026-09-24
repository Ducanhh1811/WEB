/* =========================================================
   PERSONAL HUB DATABASE
   SQL SERVER
   ========================================================= */

CREATE DATABASE PersonalHub;
GO

USE PersonalHub;
GO


/* =========================================================
   1. USERS
   ========================================================= */

CREATE TABLE Users (
    userID INT IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    fullName NVARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    role VARCHAR(20) NOT NULL DEFAULT 'USER',
    createdDate DATETIME DEFAULT GETDATE(),

    CONSTRAINT CK_Users_Role
        CHECK (role IN ('USER', 'ADMIN'))
);
GO


/* =========================================================
   2. GAME
   ========================================================= */

CREATE TABLE Genres (
    genreID INT IDENTITY(1,1) PRIMARY KEY,
    genreName NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE Games (
    gameID INT IDENTITY(1,1) PRIMARY KEY,
    gameName NVARCHAR(100) NOT NULL,
    description NVARCHAR(MAX),
    image VARCHAR(500),
    developer NVARCHAR(100),
    releaseDate DATE,
    genreID INT,
    status BIT NOT NULL DEFAULT 1,

    CONSTRAINT FK_Games_Genres
        FOREIGN KEY (genreID)
        REFERENCES Genres(genreID)
);
GO

CREATE TABLE UserGames (
    userID INT NOT NULL,
    gameID INT NOT NULL,
    playStatus VARCHAR(30) NOT NULL DEFAULT 'Want to Play',
    rating DECIMAL(3,1),
    addedDate DATE DEFAULT GETDATE(),

    PRIMARY KEY (userID, gameID),

    CONSTRAINT FK_UserGames_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_UserGames_Games
        FOREIGN KEY (gameID)
        REFERENCES Games(gameID),

    CONSTRAINT CK_UserGames_Rating
        CHECK (rating IS NULL OR (rating >= 0 AND rating <= 10)),

    CONSTRAINT CK_UserGames_Status
        CHECK (playStatus IN
        ('Want to Play', 'Playing', 'Completed', 'Dropped'))
);
GO

CREATE TABLE GameReviews (
    reviewID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    gameID INT NOT NULL,
    rating DECIMAL(3,1) NOT NULL,
    comment NVARCHAR(1000),
    reviewDate DATETIME DEFAULT GETDATE(),

    CONSTRAINT FK_GameReviews_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_GameReviews_Games
        FOREIGN KEY (gameID)
        REFERENCES Games(gameID),

    CONSTRAINT CK_GameReviews_Rating
        CHECK (rating >= 0 AND rating <= 10)
);
GO


/* =========================================================
   3. MOVIE
   ========================================================= */

CREATE TABLE MovieCategories (
    categoryID INT IDENTITY(1,1) PRIMARY KEY,
    categoryName NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE Movies (
    movieID INT IDENTITY(1,1) PRIMARY KEY,
    movieName NVARCHAR(150) NOT NULL,
    description NVARCHAR(MAX),
    image VARCHAR(500),
    director NVARCHAR(100),
    releaseDate DATE,
    categoryID INT,
    status BIT NOT NULL DEFAULT 1,

    CONSTRAINT FK_Movies_MovieCategories
        FOREIGN KEY (categoryID)
        REFERENCES MovieCategories(categoryID)
);
GO

CREATE TABLE MovieReviews (
    reviewID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    movieID INT NOT NULL,
    rating DECIMAL(3,1) NOT NULL,
    comment NVARCHAR(1000),
    reviewDate DATETIME DEFAULT GETDATE(),

    CONSTRAINT FK_MovieReviews_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_MovieReviews_Movies
        FOREIGN KEY (movieID)
        REFERENCES Movies(movieID),

    CONSTRAINT CK_MovieReviews_Rating
        CHECK (rating >= 0 AND rating <= 10)
);
GO


/* =========================================================
   4. FOOD
   ========================================================= */

CREATE TABLE FoodCategories (
    categoryID INT IDENTITY(1,1) PRIMARY KEY,
    categoryName NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE Foods (
    foodID INT IDENTITY(1,1) PRIMARY KEY,
    foodName NVARCHAR(100) NOT NULL,
    description NVARCHAR(MAX),
    image VARCHAR(500),
    price DECIMAL(12,2),
    categoryID INT,
    status BIT NOT NULL DEFAULT 1,

    CONSTRAINT FK_Foods_FoodCategories
        FOREIGN KEY (categoryID)
        REFERENCES FoodCategories(categoryID),

    CONSTRAINT CK_Foods_Price
        CHECK (price IS NULL OR price >= 0)
);
GO

CREATE TABLE FoodReviews (
    reviewID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    foodID INT NOT NULL,
    rating DECIMAL(3,1) NOT NULL,
    comment NVARCHAR(1000),
    reviewDate DATETIME DEFAULT GETDATE(),

    CONSTRAINT FK_FoodReviews_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_FoodReviews_Foods
        FOREIGN KEY (foodID)
        REFERENCES Foods(foodID),

    CONSTRAINT CK_FoodReviews_Rating
        CHECK (rating >= 0 AND rating <= 10)
);
GO


/* =========================================================
   5. STUDY
   ========================================================= */

CREATE TABLE Subjects (
    subjectID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    subjectName NVARCHAR(100) NOT NULL,
    description NVARCHAR(500),

    CONSTRAINT FK_Subjects_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID)
);
GO

CREATE TABLE Notes (
    noteID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    subjectID INT,
    title NVARCHAR(200) NOT NULL,
    content NVARCHAR(MAX),
    createdDate DATETIME DEFAULT GETDATE(),
    updatedDate DATETIME,

    CONSTRAINT FK_Notes_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_Notes_Subjects
        FOREIGN KEY (subjectID)
        REFERENCES Subjects(subjectID)
);
GO

CREATE TABLE Assignments (
    assignmentID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    subjectID INT,
    title NVARCHAR(200) NOT NULL,
    description NVARCHAR(MAX),
    dueDate DATETIME,
    status VARCHAR(30) NOT NULL DEFAULT 'Pending',

    CONSTRAINT FK_Assignments_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_Assignments_Subjects
        FOREIGN KEY (subjectID)
        REFERENCES Subjects(subjectID),

    CONSTRAINT CK_Assignments_Status
        CHECK (status IN ('Pending', 'In Progress', 'Completed'))
);
GO


/* =========================================================
   6. FINANCE
   ========================================================= */

CREATE TABLE FinanceCategories (
    categoryID INT IDENTITY(1,1) PRIMARY KEY,
    categoryName NVARCHAR(50) NOT NULL UNIQUE,
    type VARCHAR(20) NOT NULL,

    CONSTRAINT CK_FinanceCategories_Type
        CHECK (type IN ('INCOME', 'EXPENSE'))
);
GO

CREATE TABLE Transactions (
    transactionID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    categoryID INT,
    amount DECIMAL(15,2) NOT NULL,
    description NVARCHAR(500),
    transactionDate DATETIME DEFAULT GETDATE(),

    CONSTRAINT FK_Transactions_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_Transactions_FinanceCategories
        FOREIGN KEY (categoryID)
        REFERENCES FinanceCategories(categoryID),

    CONSTRAINT CK_Transactions_Amount
        CHECK (amount > 0)
);
GO


/* =========================================================
   7. SCHEDULE
   ========================================================= */

CREATE TABLE Schedules (
    scheduleID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    title NVARCHAR(200) NOT NULL,
    description NVARCHAR(500),
    startTime DATETIME NOT NULL,
    endTime DATETIME,
    location NVARCHAR(200),

    CONSTRAINT FK_Schedules_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID)
);
GO


/* =========================================================
   8. PROJECTS
   ========================================================= */

CREATE TABLE ProjectCategories (
    categoryID INT IDENTITY(1,1) PRIMARY KEY,
    categoryName NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE Projects (
    projectID INT IDENTITY(1,1) PRIMARY KEY,
    userID INT NOT NULL,
    categoryID INT,
    projectName NVARCHAR(150) NOT NULL,
    description NVARCHAR(MAX),
    image VARCHAR(500),
    githubLink VARCHAR(500),
    demoLink VARCHAR(500),
    startDate DATE,
    endDate DATE,
    status VARCHAR(30) NOT NULL DEFAULT 'In Progress',

    CONSTRAINT FK_Projects_Users
        FOREIGN KEY (userID)
        REFERENCES Users(userID),

    CONSTRAINT FK_Projects_ProjectCategories
        FOREIGN KEY (categoryID)
        REFERENCES ProjectCategories(categoryID),

    CONSTRAINT CK_Projects_Status
        CHECK (status IN ('Planning', 'In Progress', 'Completed', 'Archived'))
);
GO