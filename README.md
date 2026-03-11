# Greeting App – REST API (Spring Boot)

## Project Description

The **Greeting App** is a RESTful web application developed using **Spring Boot**.
It demonstrates the implementation of REST APIs with a layered architecture including **Controller, Service, Repository, and Model layers**.

The application allows users to create, retrieve, update, and delete greeting messages.

---

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* IntelliJ IDEA
* Git & GitHub

---

## Project Structure

```
greetingapp
│
├── controller
│     GreetingController.java
│
├── service
│     GreetingService.java
│
├── repository
│     GreetingRepository.java
│
├── model
│     Greeting.java
│
├── dto
│     UserDTO.java
│
└── GreetingAppApplication.java
```

---

## Features Implemented

### UC1 – Greeting Controller

Created REST endpoints to return JSON responses using different HTTP methods.

### UC2 – Service Layer

Implemented a service layer to return a simple greeting message:
`Hello World`

### UC3 – Custom Greeting Message

Application can generate greeting messages based on user input:

* First Name + Last Name
* Only First Name
* Only Last Name
* Default message: `Hello World`

### UC4 – Save Greeting Message

Greeting messages can be stored in the database using Spring Data JPA.

### UC5 – Find Greeting by ID

Retrieve a greeting message from the repository using its ID.

### UC6 – List All Greetings

Fetch all stored greeting messages.

### UC7 – Update Greeting

Modify an existing greeting message.

### UC8 – Delete Greeting

Delete a greeting message from the repository.
g