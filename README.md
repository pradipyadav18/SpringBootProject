# Spring Boot JDBC Web Application

This is a Spring Boot MVC web application that utilizes JDBC for database connectivity. It includes essential user management functionalities such as User Registration, Login authentication, and Profile Views.

## 🚀 Features
* **User Authentication**: Secure Login and Logout functionality.
* **User Registration**: Dynamic forms for onboarding new users.
* **Profile Management**: Dedicated profile page for logged-in users.
* **Dynamic Views**: Built using JSP (JavaServer Pages) for the user interface.
* **Database Connectivity**: Uses the Spring Boot JDBC module for robust data persistence.

## 🛠️ Tech Stack
* **Backend**: Java, Spring Boot (MVC, JDBC)
* **Frontend**: JSP, HTML, CSS
* **Build Tool**: Maven
* **Database**: MySQL / Oracle (As configured in application.properties)

## 💻 Setup Instructions

### 1. Prerequisites
* Java 17 or higher installed.
* Eclipse IDE (with STS plugin) or IntelliJ IDEA.
* Running Database server (e.g., MySQL).

### 2. Database Configuration
Before running the application, open the `src/main/resources/application.properties` file and update your database configurations:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### 3. How to Run
1. Clone this repository or download and extract the ZIP file.
2. Open Eclipse IDE, go to **File -> Import -> Existing Maven Projects**, and select the project.
3. Right-click on the project root folder: **Run As -> Spring Boot App**.
4. Open your web browser and navigate to: `http://localhost:8080/`

---
Developed by [Pradip Yadav](https://github.com)
