# Student Enrollment & Grading System (Enhanced Java OOP)

An advanced console-based Java application demonstrating core Object-Oriented Programming (OOP) principles, featuring strict encapsulation, constructor chaining, data validation, and global instance tracking.

## Core OOP Concepts Demonstrated

This project showcases clean coding standards and robust architecture patterns in Java:

### 1. Encapsulation & Data Validation
* **Private Access Modifiers:** Vital instance variables like `studentName` and `academicScore` are marked `private` to protect the object's internal state from unauthorized external manipulation.
* **Mutator Validation:** Data entry is guarded by the `assignScore()` method, ensuring scores strictly remain within valid parameters ($0$ to $100$).

### 2. Constructor Overloading & Chaining (`this()`)
* Features multiple constructor definitions to allow flexible object creation (e.g., enrolling a student with or without an initial score).
* **Implements **Constructor Chaining** using the `this(...)` keyword to eliminate redundant initialization logic and adhere to DRY (Don't Repeat Yourself) principles.

### 3. Static Members & Global Instance Tracking
* **Static Variable (`activeEnrollments`):** Acts as a central counter in class memory space, incrementing automatically each time a new student object is instantiated.
* **Static Methods:** Built-in system registry tracking methods (`printSystemRegistry()`) that belong directly to the class level rather than an isolated object instance.

### 4. Final Constants & Methods
* **Compile-Time Constants:** Variables like `SCORE_CEILING` and `MIN_PASS_SCORE` are locked down using `static final` to establish immutable benchmark thresholds across the entire program.
* **Final Methods:** The `printEvaluationPolicy()` method is explicitly sealed with the `final` keyword to block any potential method overriding by future subclasses.

## Expected Console Output

```text
=== Student File ===
ID: 101
Name: Farhan
Current Score: 95.5 / 100
Academic Status: CREDIT
Enrolled at: COMSATS University [Object Oriented Programming]
=============================================================

=== Student File ===
ID: 102
Name: Ahmed
Current Score: 48.0 / 100
Academic Status: REMEDIAL/PENDING
Enrolled at: COMSATS University [Object Oriented Programming]
=============================================================

=== Student File ===
ID: 103
Name: Ali
Current Score: 0.0 / 100
Academic Status: REMEDIAL/PENDING
Enrolled at: COMSATS University [Object Oriented Programming]
=============================================================

----- REGISTRY METRICS -----
Campus: COMSATS University
Total Dynamic Registrations: 3
----------------------------

... Updating system profiles ...

=== Student File ===
ID: 103
Name: Ali
Current Score: 78.5 / 100
Academic Status: CREDIT
Enrolled at: FAST University [Object Oriented Programming]
==========================================================

----- REGISTRY METRICS -----
Campus: FAST University
Total Dynamic Registrations: 3
----------------------------