
# VitaNova Backend

This is the backend service for the VitaNova project – an AI-driven e-Commerce platform built with Spring Boot and MySQL using a microservices architecture.

## ⚙️ Tech Stack

- **Framework:** Spring Boot
- **Database:** MySQL
- **Authentication:** JWT, OAuth 2.0
- **Real-time Communication:** WebSocket
- **External APIs:** Spotify API, Google Maps API
- **Build Tool:** Maven

## 🧩 Microservices Overview

- **User Service** – Handles user registration, login, and profile management
- **Product Service** – Manages product catalog
- **Inventory Service** – Tracks real-time stock levels
- **Auth Service** – JWT and OAuth2-based authentication and authorization
- **Nutrition/Health Service** – Scans food and tracks calories

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/SnapeV1/VitaNovaBackEnd.git
cd vitanova-backend
```

### 2. Configure Application Properties

Update the `src/main/resources/application.properties` file with your local configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vitanova
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

# Security
jwt.secret=yourJWTSecret

# External APIs
spotify.api.key=yourSpotifyAPIKey
google.maps.api.key=yourGoogleMapsAPIKey
```

### 3. Start MySQL Server

Ensure your MySQL server is running and has a database named `vitanova`.

```sql
CREATE DATABASE vitanova;
```

### 4. Build and Run the Application

```bash
./mvnw clean install
./mvnw spring-boot:run
```

The backend will start on [http://localhost:8080](http://localhost:8080).

---

## 🧪 Testing

You can test the REST APIs using Postman or any HTTP client. Swagger documentation can be added for easier API exploration.

## 📦 Packaging

To package the application into a `.jar` file:

```bash
./mvnw clean package
```

The generated JAR will be located in the `target/` directory.

## 📄 License

This project is licensed under the MIT License.
