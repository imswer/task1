# Spring Boot Task API 🚀

This is a **Spring Boot REST API** that allows users to create, update, and execute tasks.

## Features 🌟

- Create a task ✅
- Update a task 🔄
- Execute a task ⚡
- MongoDB as the database 🗄️

---

## 📌 Installation

1. Clone the repository:

```sh
 git clone <your-repo-url>
```

2. Navigate to the project folder:

```sh
 cd TaskApi
```

3. Build the project:

```sh
 mvn clean install
```

4. Run the application:

```sh
 mvn spring-boot:run
```

---

## 🛠 API Endpoints

### 1️⃣ **Create a Task**

```sh
curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"id":"21122","name":"saiteja","owner":"Korrayi Saiteja","command":"echo Amrita vishwa vidyapeetham"}'
```
![Create Task](images/post.png)

### 2️⃣ **Get All Tasks**

```sh
curl -X GET http://localhost:8080/tasks
```
![Get All Tasks](images/listalltasks.png)

### 3️⃣ **Get a Task by ID**

```sh
curl -X GET http://localhost:8080/tasks/21122
```
![Get Task](images/get.png)

### 4️⃣ **Update a Task**

```sh
curl -X PUT http://localhost:8080/tasks/21122 -H "Content-Type: application/json" -d '{"id":"21122","name":"saiteja","owner":"Korrayi Saiteja","command":"echo I am studying in Amrita Vishwa Vidyapeetham"}'
```
![Update Task](images/update.png)

### 5️⃣ **Execute a Task**

```sh
curl -X PUT http://localhost:8080/tasks/21122/execute
```
![Execute Task](images/execute.png)

### 6️⃣ **Delete a Task**

```sh
curl -X DELETE http://localhost:8080/tasks/21122
```
![Delete Task](images/delete.png)

---


## 📸 Screenshots

All screenshots are stored in the images directory.

- [Create Task](images/post.png)
- [Get All Tasks](images/listalltasks.png)
- [Get Task by ID](images/get.png)
- [Update Task](images/update.png)
- [Execute Task](images/execute.png)
- [Delete Task](images/delete.png)

---

## 📌 Technologies Used

- **Spring Boot**
- **MongoDB**
- **Maven**

