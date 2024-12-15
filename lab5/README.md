# Lab 5 - Spring Boot Web App

Hi there! This is **Lab 5**, a fun and simple web app built with **Spring Boot**. It lets you validate emails, check password strength, and take a quiz. Let’s dive in!

---

## 🚀 Getting Started

1. **Clone the project**:
   ```bash
   git clone <your-repo-url>
   cd lab5
   ```

2. **Run the app**:
   - If you’re using Maven Wrapper:
     ```bash
     ./mvnw spring-boot:run
     ```
   - Or, if you have Maven installed:
     ```bash
     mvn spring-boot:run
     ```

3. **Open in your browser**:
   - Head to [http://localhost:8080](http://localhost:8080) to see the app in action.

4. **Run tests** (if you want to check everything works):
   ```bash
   ./mvnw test
   ```

---

## 🌟 Features

### 1. **Email Validation**
   - Enter an email to check if it’s valid.
   - Try it: [http://localhost:8080/validateEmail](http://localhost:8080/validateEmail).

### 2. **Password Strength Checker**
   - Check if your password is strong enough (must be at least 8 characters, include a number, and a special symbol like `!@#$`).
   - Try it: [http://localhost:8080/validatePassword](http://localhost:8080/validatePassword).

### 3. **Quiz**
   - Take a fun quiz with 10 questions and see how well you do!
   - Try it: [http://localhost:8080/quiz](http://localhost:8080/quiz).

---

## 🗂️ How It’s Organized

- **Code**: `src/main/java`
- **Tests**: `src/test/java`
- **Web Pages**: `src/main/resources/templates`
- **Static Files (CSS, etc.)**: `src/main/resources/static`

---

## ❤️ Thanks for Checking It Out!

Thanks for stopping by! If you run into any issues or have ideas for improvements, feel free to share.