-- Chapter 34.3.3: Creating Tables

-- 1. Create Course Table
CREATE TABLE Course (
    courseId CHAR(5),
    subjectId CHAR(4) NOT NULL,
    courseNumber INTEGER,
    title VARCHAR(50) NOT NULL,
    numOfCredits INTEGER,
    PRIMARY KEY (courseId)
);

-- 2. Create Student Table
CREATE TABLE Student (
    ssn CHAR(9),
    firstName VARCHAR(25),
    mi CHAR(1),
    lastName VARCHAR(25),
    birthDate DATE,
    street VARCHAR(25),
    phone CHAR(11),
    zipCode CHAR(5),
    deptId CHAR(4),
    PRIMARY KEY (ssn)
);

-- 3. Create Enrollment Table with Foreign Keys
CREATE TABLE Enrollment (
    ssn CHAR(9),
    courseId CHAR(5),
    dateRegistered DATE,
    grade CHAR(1),
    PRIMARY KEY (ssn, courseId),
    FOREIGN KEY (ssn) REFERENCES Student(ssn),
    FOREIGN KEY (courseId) REFERENCES Course(courseId)
);
