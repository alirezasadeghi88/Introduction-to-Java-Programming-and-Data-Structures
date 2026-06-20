# Chapter 34: Java Database Programming (JDBC)

This chapter covers the essentials of connecting Java applications to relational databases using JDBC (Java Database Connectivity).

## Learning Objectives
- [ ] Understand database concepts and Database Management Systems (DBMS) (§34.2).
- [ ] Understand the relational data model: structures, constraints, and languages (§34.2).
- [ ] Use **SQL** to create/drop tables and retrieve/modify data (§34.3).
- [ ] Learn how to load a driver, connect to a database, and execute statements using **JDBC** (§34.4).
- [ ] Use `PreparedStatement` to execute precompiled SQL statements safely (§34.5).
- [ ] Use `CallableStatement` to execute stored procedures and functions (§34.6).
- [ ] Explore database metadata using `DatabaseMetaData` and `ResultSetMetaData` (§34.7).

## SQL & Java Integration
In this folder, you will find both Java source code and SQL scripts:
- `.java` files: Logic for connecting and processing data.
- `.sql` files: Database schema and initial data setup.

## Key Technologies
- **JDBC Driver**: The bridge between Java and a specific DB (MySQL, Oracle, etc.).
- **SQL (Structured Query Language)**: Used for data manipulation.
- **Connection Pooling**: (Advanced concept) managing database connections efficiently.
