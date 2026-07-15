# ⚔️ Build Your Character

### *A Console-Based RPG Character Management System*

<p align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge\&logo=mysql\&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge\&logo=github)

</p>

---

# 📖 About the Project

**Build Your Character** is a **console-based RPG Character Management System** developed using **Core Java**, **Advanced Java (JDBC)**, **MySQL**, **Collections Framework**, **DAO Pattern**, **Interfaces**, and **CRUD Operations**.

Unlike traditional student or employee management systems, this project applies the same software engineering concepts to the world of **Role-Playing Games (RPGs)**. Users can create, manage, search, update, and delete fantasy characters while storing all information permanently in a MySQL database.

The project demonstrates practical implementation of Object-Oriented Programming principles, database connectivity, and layered software architecture in an engaging gaming context.

---

# 🎯 Project Objectives

The project was developed to:

* Apply Core Java concepts in a real-world application.
* Demonstrate Object-Oriented Programming principles.
* Practice JDBC connectivity with MySQL.
* Implement the DAO (Data Access Object) Design Pattern.
* Perform complete CRUD (Create, Read, Update, Delete) operations.
* Build a modular and maintainable Java application.
* Present an engaging alternative to traditional management system projects.

---

# ✨ Features

## ➕ Create Character

Create a new RPG character by entering:

* Character ID
* Character Name
* Character Level
* Character Class
* Species
* Background
* Strength
* Dexterity
* Constitution
* Intelligence
* Wisdom
* Charisma
* Weapon

All information is permanently stored in the MySQL database.

---

## 🔍 Search Character

Search for a character using its unique Character ID.

Displays a complete RPG-style character profile if found.

---

## ✏️ Update Character

Modify any existing character information including:

* Basic Information
* RPG Attributes
* Equipment
* Background

---

## ❌ Delete Character

Remove a character permanently from the database using the Character ID.

---

## 📋 View All Characters

Displays all stored characters with important information including:

* Character ID
* Name
* Level
* Class
* Species
* Weapon

---

# 🎲 Character Information Stored

Each character contains the following information:

### Identity

* Character ID
* Character Name

### RPG Information

* Character Class
* Species
* Background

### Progress

* Character Level

### Core RPG Attributes

* Strength
* Dexterity
* Constitution
* Intelligence
* Wisdom
* Charisma

### Equipment

* Weapon

---

# ☕ Java Concepts Demonstrated

## Core Java

* Classes & Objects
* Variables
* Methods
* Constructors
* Encapsulation
* Getters & Setters
* Method Overriding (`toString()`)
* Scanner Class
* Loops
* Switch Statements
* Exception Handling

---

## Object-Oriented Programming (OOP)

* Encapsulation
* Abstraction
* Interfaces
* Polymorphism

Example:

```java
CharacterDAO dao = new CharacterDAOImpl();
```

---

## Advanced Java

* JDBC
* DriverManager
* Connection
* PreparedStatement
* ResultSet
* MySQL Database Connectivity

---

## Collections Framework

* ArrayList
* List Interface

---

## Software Engineering Concepts

* DAO Pattern
* Layered Architecture
* Separation of Concerns
* Modular Programming
* CRUD Operations

---

# 🏗 Software Architecture

The project follows a layered architecture for better modularity and maintainability.

```text
                User

                  │

                  ▼

             Main.java

                  │

                  ▼

         Character Object

                  │

                  ▼

      CharacterDAO Interface

                  │

                  ▼

     CharacterDAOImpl Class

                  │

                  ▼

         DBConnection Class

                  │

                  ▼

           MySQL Database
```

---

# 🗄 Database Design

Current database table:

```text
character_data
```

### Columns

```text
id
name
level
class_type
species
background
strength
dexterity
constitution
intelligence
wisdom
charisma
weapon
```

Each row represents one RPG character.

---

# ⚙ CRUD Operations

| Operation | SQL Command |
| --------- | ----------- |
| Create    | INSERT      |
| Read      | SELECT      |
| Update    | UPDATE      |
| Delete    | DELETE      |

The application supports complete CRUD functionality through the DAO layer.

---

# 📂 Project Structure

```text
Build-Your-Character/
│
├── src/
│   ├── Character.java
│   ├── CharacterDAO.java
│   ├── CharacterDAOImpl.java
│   ├── DBConnection.java
│   └── Main.java
│
├── database/
│   ├── characterforge.sql
│   └── Character_Database.png
│
├── screenshots/
│   ├── main-menu.png
│   ├── create-character.png
│   ├── search-character.png
│   ├── update-character.png
│   ├── delete-character.png
│   ├── view-all-characters.png
│   └── database-table.png
│
├── docs/
│   ├── Project_Report.pdf
│   └── Architecture.png
│
├── README.md
├── requirements.md
├── LICENSE
├── .gitignore
└── CHANGELOG.md
```

---

# 💻 Technology Stack

| Category              | Technology              |
| --------------------- | ----------------------- |
| Programming Language  | Java                    |
| Database              | MySQL                   |
| Database Connectivity | JDBC                    |
| Architecture          | DAO Pattern             |
| Collections           | ArrayList               |
| IDE                   | Eclipse / IntelliJ IDEA |
| Version Control       | Git                     |
| Repository            | GitHub                  |

---

# 📸 Screenshots

The following screenshots will be included after project completion:

* Main Menu
* Create Character
* Search Character
* Update Character
* Delete Character
* View All Characters
* MySQL Database Table

---

# 🚀 Installation

## Clone the Repository

```bash
git clone https://github.com/<your-username>/Build-Your-Character.git
```

---

## Requirements

* Java JDK 17 or later
* MySQL Server
* MySQL Connector/J
* Eclipse IDE or IntelliJ IDEA

---

## Database Setup

1. Create a MySQL database.
2. Import the provided SQL script from the `database` folder.
3. Update database credentials in `DBConnection.java`.

---

## Run the Project

1. Open the project in your preferred Java IDE.
2. Add the MySQL JDBC Connector to the project's build path.
3. Run `Main.java`.
4. Use the console menu to manage RPG characters.

---

# 🔮 Future Scope

Planned improvements include:

* Character Portraits
* Inventory System
* Armor & Equipment Management
* Multiple Weapons
* Spell Management
* Health Points (HP)
* Mana Points (MP)
* Experience Points (XP)
* Level Progression
* Quest Tracking
* Party Management
* Character Status System
* Java Swing / JavaFX GUI
* Web-Based Version
* Mobile Application

---

# ⚠️ Limitations

Current version:

* Console-based application.
* Single database table.
* One weapon per character.
* No authentication system.
* No graphical user interface.
* No automatic RPG stat calculations.

These limitations keep the project aligned with the Java concepts covered during the course while leaving room for future enhancements.

---

# 👥 Team Members

| Name           | Role                                                                                         |
| -------------- | -------------------------------------------------------------------------------------------- |
| Omkar Gujar    | Java Development, JDBC Integration,Database Design, Testing, Project Support,  Documentation |
| Prachita Bhoir | Java Development, JDBC Integration,Database Design, Testing, Project Support,  Documentation |

---

# 📄 License

This project is licensed under the **MIT License**.

See the `LICENSE` file for more details.

---

# ⭐ Support

If you found this project interesting or helpful, consider giving it a ⭐ on GitHub.

It helps support the project and encourages future improvements.

---

<p align="center">

### ⚔️ "Every great adventure begins with a single character."

</p>
