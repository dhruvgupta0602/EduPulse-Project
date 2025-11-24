Project: EduPulse - Faculty Feedback System

1. Problem Statement

In many educational institutions, the process of collecting feedback on faculty performance is often manual, paper-based, or lacks transparency. This leads to:

Slow Processing: Delays in analyzing data and implementing improvements.

Lack of Anonymity: Students may fear repercussions if their handwriting is recognized, leading to dishonest feedback.

Data Loss: Paper forms can be easily misplaced or damaged.

Inefficiency: Manual calculation of average scores is prone to human error.

2. Objectives

The objective of EduPulse is to digitize the evaluation process, ensuring:

Instant Analytics: Calculating average ratings immediately upon submission.

True Anonymity: Separating student identity from their feedback data to encourage honest reviews.

Ease of Access: Providing a simple, menu-driven interface for quick submission and retrieval of data.

Security: implementing Role-Based Access Control (RBAC) so only administrators can view sensitive reports.

3. Scope

Target Users: * Students: The primary voters who submit feedback.

Academic Deans/Admins: The users who manage faculty lists and view performance reports.

Boundaries: * The current version supports text-based comments and numerical ratings (1-5).

Data is stored in memory for the duration of the session (simulated persistence).

4. High-Level Features

Role-Based Authentication: Secure login mechanism distinguishing between Admins and Students.

Dynamic Rating System: Capability to rate faculty on multiple parameters (Subject Knowledge, Punctuality, etc.).

Automated Report Generation: Instantly aggregates data to display "Average Rating" and "Total Reviews".

Top Performer Identification: An algorithm to automatically identify and display the highest-rated faculty member.