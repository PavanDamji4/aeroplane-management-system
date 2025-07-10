# ✈️ Aeroplane Management System

**Console-Based Flight Booking System**  
`Java 17+` · `PostgreSQL 17+` · `JDBC` · `Maven` · `OOP` · `Multithreading (Optional)`

---

## 📖 Introduction

The **Aeroplane Management System** is a Java-based console project built for managing domestic airline bookings. It allows users to:

- View available flights
- Register new passengers
- Book flight tickets using valid IDs

All data is persisted using **PostgreSQL** and accessed via **JDBC**. This project is ideal for core Java practice, academic submissions, or entry-level internship showcases.

---

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Database Schema](#database-schema)
- [Usage Demo](#usage-demo)
- [Screenshots](#screenshots)
- [Future Improvements](#future-improvements)
- [Dependencies Used](#dependencies-used)
- [Author](#author)

---

## 📌 About

The application is built using **Java (OOP principles)** with **JDBC** to interact with a **PostgreSQL** database. It is menu-driven and runs entirely via the console. Designed to reduce manual data entry and booking errors, it is cleanly structured and ready for future GUI upgrades.

---

## 🚀 Features

- ✅ View all available flights
- 👤 Add new passengers
- 🎫 Book flight tickets (validated by foreign keys)
- 💾 Real-time PostgreSQL data persistence
- ❌ Safe handling of invalid inputs
- 📜 Clean modular design with DAO pattern
- 🌐 Multithreading-ready structure (optional)

---

## 🧱 Project Structure

aeroplane-management-system/
├── src/
│ └── main/java/com/pavan/aeroplane/
│ ├── model/ # Flight, Passenger, Booking POJOs
│ ├── dao/ # DAO interfaces
│ ├── dao/impl/ # DAO JDBC implementations
│ ├── util/ # DB connection, simulator, file logs
│ └── Main.java # Entry point
├── target/
├── pom.xml
└── README.md


---

## ⚙️ Setup & Installation

### ✅ Prerequisites

- Java JDK 17 or higher
- PostgreSQL 17+ installed & running
- Maven 3.9.x or higher

### 📦 Steps to Run

```bash
# Clone the repository
git clone https://github.com/PavanDamji4/aeroplane-management-system.git

# Navigate into the project
cd aeroplane-management-system

# Compile and run the app
mvn clean compile exec:java

---

### Database Schema