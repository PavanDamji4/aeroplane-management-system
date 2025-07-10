✈️ Aeroplane Management System
A Console-Based Flight Booking System | Core Java | JDBC | PostgreSQL | Maven




📌 Overview
The Aeroplane Management System is a Java-based CLI project designed for airline booking management. It lets you:

View available flights

Register passengers

Book tickets using a flight-passenger mapping system

Store, retrieve, and validate data using PostgreSQL

Built with clean architecture and modular design using OOP principles, JDBC, and multithreading concepts, this project is ideal for academic submission, internships, or personal practice.

🧩 Features
✅ Flight Viewer – Lists all available flights with times
✅ Passenger Management – Add new passengers dynamically
✅ Booking System – Book tickets using valid flight and passenger IDs
✅ Database Connectivity – Data stored/retrieved using PostgreSQL
✅ Foreign Key Validation – Prevents invalid bookings
✅ Multithreading (Optional Add-on) – For simulating takeoff, file logging, or background tasks
✅ Console UI – Simple and interactive terminal interface
✅ Clean Codebase – Follows best practices and modular design

🧱 Tech Stack
Layer	Tech Used
Language	Java (JDK 17+)
Build Tool	Apache Maven
DBMS	PostgreSQL
JDBC Driver	PostgreSQL JDBC
IDE	IntelliJ / VS Code
Project Type	Console + OOP + DB

📂 Project Structure
bash
Copy
Edit
aeroplane-management-system/
│
├── src/
│   └── main/java/com/pavan/aeroplane/
│       ├── dao/             # DAO interfaces
│       ├── dao/impl/        # DAO implementations (JDBC)
│       ├── model/           # POJOs: Flight, Passenger, Booking
│       ├── util/            # DB connection, File logging, etc.
│       └── Main.java        # App entry point
│
├── target/                  # Compiled class files
├── pom.xml                  # Maven configuration
└── README.md
⚙️ Setup & Installation
✅ Prerequisites
Java JDK 17 or later

PostgreSQL installed and running

Maven installed and added to PATH

A PostgreSQL database named aeroplane_db with tables:

flights

passengers

bookings

🔧 Steps to Run
bash
Copy
Edit
# Clone the project
git clone https://github.com/PavanDamji4/aeroplane-management-system.git
cd aeroplane-management-system

# Build and run the project
mvn clean compile exec:java
🔌 PostgreSQL Table Schema
You must create the following tables before running the app:

sql
Copy
Edit
CREATE TABLE flights (
    flight_id SERIAL PRIMARY KEY,
    flight_name VARCHAR(100),
    source VARCHAR(50),
    destination VARCHAR(50),
    departure_time TIME,
    arrival_time TIME
);

CREATE TABLE passengers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(10)
);

CREATE TABLE bookings (
    booking_id SERIAL PRIMARY KEY,
    flight_id INT REFERENCES flights(flight_id),
    passenger_id INT REFERENCES passengers(id)
);
💻 Usage Walkthrough
On running the app, you'll see:

pgsql
Copy
Edit
========= ✈️ Aeroplane Management System ✈️ =========
1. View All Flights
2. Add New Passenger
3. Book Ticket
4. Exit
✅ Select options to view flights, register passengers, and book tickets
❌ Booking with invalid flight/passenger IDs will throw FK errors
🧠 All operations interact with PostgreSQL in real-time

📸 Screenshots
Add these manually by taking console screenshots

✅ Flight list

👤 Passenger added

🎫 Booking success

❌ Booking FK error

🔍 Future Improvements
View all bookings

View all registered passengers

Cancel a booking

Admin authentication (username + password)

GUI using Swing or JavaFX

Unit testing with JUnit

📚 Dependencies Used
xml
Copy
Edit
<dependencies>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.3</version>
    </dependency>
</dependencies>
👨‍💻 Developer
Jay Damji
📧 LinkedIn Profile / GitHub

