# Hotel Management System (HMS)

This is a simple Hotel Management System developed using Spring Boot.

## Prerequisites
- Java 17
- Maven

## Setup

1. Clone the repository
   ```bash
   git clone <repository-url>
   cd hotel-management-system
   ```

2. Build the project
   ```bash
   mvn clean install
   ```

3. Run the application
   ```bash
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8080`

## API Endpoints
- **GET /api/bookings** - Retrieve all bookings.
- **POST /api/bookings** - Create a new booking.
- **GET /api/bookings/{id}** - Retrieve booking details by ID.