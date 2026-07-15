# Build Your Character – Software & System Requirements

## Project Name

**Build Your Character – Console-Based RPG Character Management System**

---

# 1. Project Overview

**Build Your Character** is a console-based Java application that allows users to create, manage, and maintain Role-Playing Game (RPG) characters using a MySQL database. The project demonstrates the implementation of Object-Oriented Programming (OOP), JDBC connectivity, the DAO Design Pattern, and CRUD operations in a structured and modular application.

The system enables users to create fantasy characters, view stored records, update character information, search for specific characters, and delete characters from the database through a menu-driven interface.

This project was developed as part of a Computer Engineering academic curriculum to demonstrate practical database-driven application development using Java.

---

# 2. Software Requirements

## Programming Language

* Java (JDK 17 or later)

---

## Database

* MySQL Server 8.0 or later

---

## Database Connectivity

* JDBC (Java Database Connectivity)
* MySQL Connector/J Driver

---

## Development Environment

Recommended IDEs:

* Eclipse IDE
* IntelliJ IDEA
* Visual Studio Code (Java Extensions)

---

## Version Control

* Git
* GitHub

---

## Operating System

Supported Operating Systems:

* Windows 10
* Windows 11
* Linux
* macOS

---

# 3. Hardware Requirements

## Minimum Requirements

Processor:

* Intel Core i3 (4th Generation) or equivalent

RAM:

* 4 GB

Storage:

* 500 MB available space

Display:

* 1366 × 768 resolution

Internet:

* Required only for downloading dependencies and cloning the repository

---

## Recommended Requirements

Processor:

* Intel Core i5 / AMD Ryzen 5 or better

RAM:

* 8 GB or higher

Storage:

* SSD with at least 1 GB free space

Display:

* Full HD (1920 × 1080)

---

# 4. Software Dependencies

The project requires the following software:

* Java Development Kit (JDK)
* MySQL Server
* MySQL Workbench (Optional)
* MySQL Connector/J
* Git
* GitHub Account
* Java IDE

---

# 5. Technologies Used

| Category              | Technology               |
| --------------------- | ------------------------ |
| Programming Language  | Java                     |
| Database              | MySQL                    |
| Database Connectivity | JDBC                     |
| Design Pattern        | DAO (Data Access Object) |
| Data Structure        | ArrayList                |
| IDE                   | Eclipse / IntelliJ IDEA  |
| Version Control       | Git                      |
| Repository Hosting    | GitHub                   |

---

# 6. Java Concepts Used

## Core Java

* Classes and Objects
* Constructors
* Methods
* Encapsulation
* Getters and Setters
* Scanner Class
* Loops
* Conditional Statements
* Exception Handling
* Method Overriding

---

## Object-Oriented Programming

* Encapsulation
* Abstraction
* Interfaces
* Polymorphism

---

## Advanced Java

* JDBC
* DriverManager
* Connection
* PreparedStatement
* ResultSet

---

## Collections Framework

* ArrayList
* List Interface

---

## Software Engineering Concepts

* DAO Pattern
* Layered Architecture
* CRUD Operations
* Modular Programming
* Separation of Concerns

---

# 7. Functional Requirements

The system shall:

* Allow users to create RPG characters.
* Store character data in a MySQL database.
* Display all stored characters.
* Search for a character using Character ID.
* Update existing character details.
* Delete characters from the database.
* Validate user input where applicable.
* Display a menu-driven console interface.

---

# 8. Non-Functional Requirements

The application should:

* Provide a simple and user-friendly interface.
* Execute CRUD operations efficiently.
* Maintain modular code architecture.
* Ensure reliable database connectivity.
* Support easy maintenance and future enhancements.
* Follow standard Java coding conventions.

---

# 9. Database Requirements

Database:

```text
characterforge
```

Primary Table:

```text
character_data
```

The database stores all RPG character information, including:

* Character ID
* Character Name
* Character Class
* Species
* Background
* Level
* Strength
* Dexterity
* Constitution
* Intelligence
* Wisdom
* Charisma
* Weapon

---

# 10. Browser Requirements

Not Applicable.

This project is a console-based Java application and does not require a web browser.

---

# 11. Installation Summary

1. Clone the GitHub repository.
2. Install Java JDK (17 or later).
3. Install MySQL Server.
4. Create the required database.
5. Import the SQL script from the `database` folder.
6. Configure database credentials in `DBConnection.java`.
7. Add the MySQL JDBC Connector to the project.
8. Compile and run `Main.java`.

---

# 12. Tested Environment

The application has been tested using:

* Windows 11
* Java JDK 17
* MySQL Server 8.x
* MySQL Workbench
* Eclipse IDE
* Git
* GitHub

---

# 13. Future Enhancements

Potential improvements include:

* Graphical User Interface (Java Swing / JavaFX)
* Character Portrait Support
* Inventory Management
* Equipment System
* Magic & Spell Management
* Experience (XP) Tracking
* Character Level Progression
* Quest Management
* Save & Load Profiles
* Multi-user Support
* Authentication System
* Web-based Version
* Mobile Application

---

# 14. Project Structure

```text
Build-Your-Character/
│
├── src/
├── database/
├── screenshots/
├── docs/
├── README.md
├── requirements.md
├── LICENSE
├── .gitignore
└── CHANGELOG.md
```

---

# 15. Team Members

| Name           | Contribution                                      |
| -------------- | ------------------------------------------------- |
| Omkar Gujar    | Java Development, JDBC Integration, Documentation |
| *Partner Name* | Database Design, Testing, Project Support         |

---

# 16. Version Information

**Current Version:** 1.0

**Project Status:** Completed Academic Prototype

**License:** MIT License

---

# 17. Acknowledgements

This project was developed as part of the Computer Engineering curriculum to demonstrate the practical implementation of Java programming, database connectivity, and software engineering principles. It provided hands-on experience in designing modular applications using JDBC, MySQL, and the DAO pattern while reinforcing core Object-Oriented Programming concepts.
