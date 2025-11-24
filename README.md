# PROJECT REPORT
## EduPulse: Faculty Feedback & Evaluation System

**Submitted by:**
* **Name:** Dhruv Gupta
* **Registration No:** [Enter Your Reg No]
* **Course Code:** [Enter Course Code]
* **Date:** November 24, 2025

---

## 1. Introduction
EduPulse is a Java-based console application designed to streamline the faculty feedback process in educational institutions. Traditional methods of collecting feedback—often paper-based or manual—are prone to inefficiency, lack of anonymity, and data loss. This project aims to digitize the entire workflow, allowing students to submit anonymous ratings and providing administrators with instant, calculated performance analytics.

## 2. Problem Statement
In many universities, the feedback mechanism is outdated. The core problems identified are:
* **Manual Processing:** Academic deans spend hours manually calculating average scores from hundreds of paper forms.
* **Lack of Anonymity:** Students often fear that their handwriting will be recognized, leading to dishonest or biased feedback.
* **Data Redundancy:** Physical records are difficult to maintain and archive over long periods.

## 3. Functional Requirements
The system implements three core functional modules:
1.  **Authentication Module:** Secure login for two distinct user roles (Admin and Student) to ensure data integrity.
2.  **Feedback Submission Module:** A dedicated interface for students to select faculty members and submit ratings (1-5 scale) and comments securely.
3.  **Analytics Module:** An automated engine that aggregates individual feedback to calculate the "Average Rating" for each faculty member and identifies top performers.

## 4. Non-Functional Requirements
1.  **Privacy (Anonymity):** The system design ensures that student identities are validated for voting eligibility but are *not* linked to the feedback data itself.
2.  **Reliability:** The application handles data persistence during the runtime session, ensuring no votes are lost during operation.
3.  **Scalability:** The use of `ArrayList` collections allows the system to handle an unlimited number of faculty members and students without code modification.
4.  **Usability:** A simple, menu-driven Command Line Interface (CLI) ensures that users with minimal technical knowledge can navigate the system easily.

## 5. System Architecture
The project follows the **Model-View-Controller (MVC)** architectural pattern to ensure clean code separation:
* **Model:** Represents the data structure (`User`, `Student`, `Faculty`, `Feedback`).
* **View:** Handles the user interface and input (`EduPulseApp`).
* **Controller:** Manages the business logic and data flow (`SystemController`).

## 6. Design Diagrams

### 6.1 Use Case Diagram
* **Actors:** Student, Admin
* **Student Cases:** Login, View Faculty, Submit Feedback.
* **Admin Cases:** Login, Add Faculty, View Reports, View Top Performer.

### 6.2 Class Diagram
The system uses a hierarchical class structure:
* `User` (Abstract Parent)
    * `Student` (Child) - Attributes: `hasVoted`
    * `Admin` (Child)
* `Faculty` - Contains a List of `Feedback` objects.

### 6.3 Sequence Diagram (Feedback Submission)
1.  Student -> Logs in
2.  System -> Validates Credentials
3.  Student -> Selects "Rate Faculty"
4.  System -> Displays List
5.  Student -> Enters Rating (5)
6.  System -> Updates Faculty Average -> Confirms Success.

## 7. Design Decisions & Rationale
* **Why Java?** Java was chosen for its strong Object-Oriented features (Inheritance, Polymorphism) which allowed for a modular and maintainable codebase.
* **Why Console Interface?** A CLI was selected to focus on backend logic and algorithmic efficiency rather than frontend aesthetics for this iteration.
* **Data Structure Choice:** `ArrayList` was used over Arrays for `Faculty` and `Feedback` storage to allow dynamic resizing as new data is added.

## 8. Implementation Details
The project is implemented using **Java (JDK 17)**.
* **Polymorphism:** The `showMenu()` method is overridden in both `Student` and `Admin` classes to provide dynamic interfaces based on user role.
* **Encapsulation:** All data fields (like password and ratings) are `private` and accessed only via Getter/Setter methods to ensure security.
* **Abstraction:** The `User` class is `abstract`, preventing the creation of generic users and enforcing role-specific instantiation.

## 9. Screenshots / Results
*(Add your terminal screenshots here)*

## 10. Testing Approach
We performed **Black Box Testing** on the following scenarios:
1.  **Valid Login:** Entered correct username/password -> Access Granted.
2.  **Invalid Login:** Entered wrong password -> Access Denied.
3.  **Boundary Testing:** Tried entering a rating of `6` (Scale 1-5). System correctly caught the error and displayed "Invalid Input".
4.  **Double Voting:** Verified that a student cannot vote for the same faculty member twice (simulated logic).

## 11. Challenges Faced
* **Linking Data:** Initially, it was challenging to map anonymous feedback to specific faculty members. This was solved by nesting the `List<Feedback>` inside the `Faculty` class.
* **Menu Looping:** Ensuring the application didn't exit after one action required implementing a `while(true)` loop with careful break conditions.

## 12. Future Enhancements
* **Database Integration:** Connecting to MySQL to save data permanently.
* **GUI:** Building a JavaFX interface for a better visual experience.
* **Sentiment Analysis:** Using AI libraries to analyze text comments for positive or negative sentiment.
