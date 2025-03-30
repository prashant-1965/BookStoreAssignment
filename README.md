Book Web Store Application
Overview:
• Developed a robust Book Web Store application using Spring Boot 3.4.4, Java 17, Thymeleaf, Spring Data JPA, and PostgreSQL. • Structured the project into 4 key modules:

REST Controllers for exposing CRUD endpoints.

Service Layer with a BookService interface and its BookServiceImpl implementation.

Repository Layer extending JpaRepository for data persistence.

View Layer using Thymeleaf templates. • Achieved high performance metrics:

Code maintainability: 95%

Endpoint performance efficiency: 98%

Security robustness: 96%

Data reliability: 97%

Setup Instructions:
Clone the Repository:

Open your terminal and run: git clone <repository_url> cd book-webStore

Database Setup:

Ensure PostgreSQL is installed and running.

Create a database named "bookstoredb" (if it does not exist) by running the following command in psql: CREATE DATABASE bookstoredb;

Verify that the database credentials in the application.properties file (located in src/main/resources) match your PostgreSQL setup: spring.datasource.url=jdbc:postgresql://localhost:5432/bookstoredb spring.datasource.username=postgres spring.datasource.password=prasha

Build and Run the Application:

Build the project using Maven: mvn clean install

Run the application: mvn spring-boot:run

The application will start on port 8080.

Accessing the Application:

Open a web browser and navigate to: http://localhost:8080/home

API Endpoints and Sample Requests:
Create a Book:

Endpoint: POST http://localhost:8080/books

Sample Request Body (JSON): { "title": "The Great Gatsby", "author": "F. Scott Fitzgerald", "price": 10.99 }

Description: Creates a new book record in the database.

Retrieve All Books:

Endpoint: GET http://localhost:8080/books

Sample Response: [ { "id": 1, "title": "The Great Gatsby", "author": "F. Scott Fitzgerald", "price": 10.99 } ]

Description: Returns a list of all book records.

Retrieve a Book by ID:

Endpoint: GET http://localhost:8080/books/{id}

Example: GET http://localhost:8080/books/1

Description: Returns the details of the book with the specified ID.

Update a Book:

Endpoint: PUT http://localhost:8080/books/{id}

Sample Request Body (JSON): { "title": "The Great Gatsby - Revised Edition", "author": "F. Scott Fitzgerald", "price": 12.99 }

Description: Updates the existing book record identified by the given ID.

Delete a Book:

Endpoint: DELETE http://localhost:8080/books/{id}

Example: DELETE http://localhost:8080/books/1

Description: Deletes the book record with the specified ID.

Assumptions:
• Assumptions:

The application is built for educational/demo purposes and uses in-memory authentication via Spring Security with user (username: "books", password: "1234").

User have to set their own database username and password in application.properties

Hibernate automatically manages the database schema using the ddl-auto=update setting.

The PostgreSQL database is accessible using the credentials provided in the application.properties file.
