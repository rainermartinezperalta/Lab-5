# Lab 5 - Simple Web Application with REST Endpoints

Welcome to Lab 5! This project is a simple Java-based web application built using **Spring Boot**. It includes a set of REST endpoints for validating emails, checking password strength, and running a fun quiz.

---

## 🛠️ How to Set Up and Run

1. **Clone the repository**:
   ```bash
   git clone <your-repo-url>
   cd lab5
   ```

2. **Build and run the app**:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the application**:
   - Visit `http://localhost:8080` in your browser.

4. **Run tests**:
   ```bash
   ./mvnw clean test
   ```
   This will run all the tests and display results in the terminal.

---

## 📋 Features

1. **Email Validation**:
   - Endpoint: `/validate-email`
   - Accepts an email address and checks if it’s valid.

2. **Password Strength Check**:
   - Endpoint: `/check-password`
   - Analyzes password strength and provides feedback.

3. **Quiz**:
   - Endpoint: `/quiz`
   - A fun quiz that displays questions and evaluates your answers.

---

## 🚀 Try It Out

Here are the steps to interact with the application:

- **Email Validation**:
  - Send a `POST` request with an email address to `/validate-email`.
- **Password Strength Check**:
  - Send a `POST` request with a password to `/check-password`.
- **Quiz**:
  - Visit `/quiz` in the browser to take the quiz!

---

## 📦 Project Structure

- **`src/main/java`**: Contains all the Java source files.
- **`src/test/java`**: Contains unit and integration tests.
- **`src/main/resources/templates`**: Holds HTML templates for the web views.

---

## ❤️ Thank You

Thank you for checking out my project!