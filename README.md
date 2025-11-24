# EduPulse: Faculty Feedback & Evaluation System

## 1. Project Overview
**EduPulse** is a Java-based console application designed to digitize the faculty feedback process in educational institutions. It addresses the issues of manual paper-based feedback by providing a secure, anonymous, and efficient platform for students to rate faculty members and for administrators to view performance analytics.

This project was built to demonstrate **Object-Oriented Programming (OOP)** principles, modular design, and data processing logic.

## 2. Features
* **Role-Based Access Control (RBAC):** Distinct login portals for Administrators and Students.
* **Anonymous Feedback Engine:** Students can submit ratings and comments without their identity being linked to the specific feedback record, ensuring honesty.
* **Real-time Analytics:** Automatically calculates and updates the "Average Rating" for every faculty member instantly.
* **Data Persistence (Simulated):** Uses in-memory structures to maintain data during the runtime session.
* **Input Validation:** Ensures ratings are within the 1-5 scale and fields are not empty.

## 3. Technologies Used
* **Language:** Java (JDK 1.8 or higher)
* **Concepts:** OOP (Inheritance, Polymorphism, Abstraction, Encapsulation)
* **Tools:** Git/GitHub for version control, VS Code / IntelliJ IDEA.

## 4. Folder Structure

The project is organized into modular classes:

```text
src/
└── edupulse/
    ├── models/       # Contains data classes (User, Student, Faculty, Feedback)
    ├── controller/   # Contains logic (SystemController)
    └── main/         # Contains the entry point (EduPulseApp)```

## 5. Steps to Install & Run

### Prerequisites
* Ensure **Java Development Kit (JDK)** is installed on your system.
* Verify by running the following command in your terminal:
  java -version

### Execution Steps
1.  **Clone this repository:**
    git clone https://github.com/dhruvgupta0602/EduPulse-Project.git

2.  **Navigate to the source folder:**
    cd EduPulse-Project/src

3.  **Compile the Java files:**
    javac edupulse/*.java

4.  **Run the application:**
    java edupulse.EduPulseApp

## 6. Testing Instructions (Credentials)
Use the following credentials to test the different modules of the system:

### Administrator Mode
* **Username:** admin
* **Password:** admin123
* **Capabilities:** Add new faculty, view global feedback reports, find top performers.

### Student Mode
* **Username:** student1
* **Password:** pass1
* **Capabilities:** View faculty list, submit anonymous feedback.

## 7. Future Enhancements
* Integration with a SQL Database for permanent storage.
* GUI implementation using JavaFX.
* Sentiment Analysis for student comments.
