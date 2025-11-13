# 📝 Todo Application (Spring Boot + Thymeleaf)

A clean and simple **Todo Application** built with **Spring Boot**, **Thymeleaf**, and **PostgreSQL**.  
This project demonstrates basic CRUD functionality, MVC architecture, and integration of frontend templates with backend logic.

---

## Features
-  Add a new task  
-  View all tasks  
-  Toggle task completion status  
-  Delete tasks   

---

##  Tech Stack
- **Backend:** Spring Boot, Spring MVC, Spring Data JPA  
- **Frontend:** Thymeleaf, HTML, CSS  
- **Database:** PostgreSQL  
- **Build Tool:** Maven  

---

## 📂 Project Structure
src/main/java/com/todo/todoapp
│── controller/ → TaskController
│── services/ → TaskServices
│── models/ → Task entity
│── repository/ → TaskRepository
src/main/resources/
│── templates/ → tasks.html
│── static/ → CSS files



---

##  API Endpoints

| Method | Endpoint        | Description            |
|--------|------------------|------------------------|
| GET    | `/` or `/tasks` | Fetch all tasks        |
| POST   | `/`             | Add a new task         |
| GET    | `/{id}/toggle`  | Toggle a task          |
| GET    | `/{id}/delete`  | Delete a task          |

---

##  Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/logic-coders/Todo-App.git
cd Todo-App
```

### 2. Run the Project
```bash
mvn spring-boot:run
```

## Project View

<img width="2940" height="1420" alt="Screenshot 2025-11-14 at 2 11 16 AM" src="https://github.com/user-attachments/assets/87c3bacf-3a0a-4694-8248-4cb0b1117eff" />






