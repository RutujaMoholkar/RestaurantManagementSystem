# Restaurant Management System

## Project Overview

The Restaurant Management System is a web application designed to streamline and manage the various operations of a restaurant. This system includes functionalities for managing menus, orders, and customers. The project is built using Angular 6 for the frontend and Spring Boot for the backend. The database used is MySQL.

## Technology Stack

- **Frontend:** Angular 6
- **Backend:** Spring Boot
- **Database:** MySQL

## Features

- Menu Management
- Order Management
- Customer Management
- Reporting and Analytics

## Setup & Execution

### Prerequisites

- Node.js
- MySQL
- Angular CLI
- Java Development Kit (JDK)

### Clone the Repository
```
git clone https://github.com/RutujaMoholkar/restaurant-management-system.git
cd restaurant-management-system
```


### Install Dependencies

#### Backend

1. Navigate to the `backend` directory.
2. Import the project into your IDE (e.g., IntelliJ IDEA, Eclipse).
3. Add the following application properties in `src/main/resources/application.properties`:

```properties
server.port=7000

spring.datasource.url=jdbc:mysql://localhost:3306/restaurantmanagement
spring.datasource.username=root
spring.datasource.password=*****

#Hibernet Configuration
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#DevTools
spring.devtools.livereload.enabled=true
spring.devtools.restart.enabled=true 
spring.devtools.remote.debug.enabled=true
```

4. Run the Spring Boot application.
   
#### Frontend
```
cd frontend
npm install
```

### Running the Application

#### Backend

Run the Spring Boot application from your IDE or using the following command:
```
./mvnw spring-boot:run
```
The backend server will start on `http://localhost:7000`.

#### Frontend
```
cd frontend
ng serve
```
The frontend server will start on `http://localhost:4200`.



