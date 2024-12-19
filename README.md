# Spring-Boot-Todo-List Application

A simple and user-friendly Todo List application built using Spring Boot, Thymeleaf, and Spring Data JPA. This project demonstrates the use of MVC architecture to manage tasks effectively.

#Feature
Add, update, delete, and mark tasks as completed.
Persistent storage using Spring Data JPA and MySQL database.
Responsive and clean UI built with Thymeleaf and Bootstrap.
RESTful endpoints for basic CRUD operations.

#Technologies Used

Spring Boot
Thymeleaf
Spring Data JPA
H2/MySQL Database
Bootstrap (Optional)
Java 17 (or any supported version)

#Requirements

To run the project locally, ensure you have the following installed:
Java Development Kit (JDK) 17 or higher
Maven (for dependency management)
Optional: MySQL (if not using H2)

#Clone the Repository


#Configure Database

spring.datasource.url=jdbc:mysql://localhost:3306/your_database  
spring.datasource.username=your_username  
spring.datasource.password=your_password  
spring.jpa.hibernate.ddl-auto=update  

#Build and Run the Project

mvn clean install  
mvn spring-boot:run  
Open your browser and navigate to http://localhost:8080.

#Usage

Add a Task: Enter the task details in the form and click "Add".
Mark as Complete: Click the checkbox next to a task.
Update Task: Click the "Edit" button, modify the details, and save.
Delete Task: Click the "Delete" button for the task.
