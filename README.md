# 📄 Description  
This exercise implements a simple Spring Boot REST API using Gradle.  
It contains two endpoints that greet a user by name, demonstrating `@RequestParam` and `@PathVariable` usage.  
The application runs on port 9001.

---

# 💻 Technologies Used  
- Java 17  
- Spring Boot 3  
- Gradle 8  
- REST API  

---

# 📋 Requirements  
- Java 17 installed  
- Gradle wrapper included (no global installation required)  
- Port 9001 available for the server  

---

# 🛠️ Installation
1. Clone the repository:  
   ```bash
   git clone https://github.com/Andrescalvo22/S4.01-Spring-Framework-Nivell2.git

2. Navigate into the project folder:
  ```bash
  cd S4.01-Spring-Framework-Nivell2
  ```
---

# ▶️ Execution
-Run the application using the Gradle wrapper:
```bash

 ./gradlew bootRun
```
-Test endpoints in your browser or Postman:

http://localhost:9001/HelloWorld

http://localhost:9001/HelloWorld2/YourName

---

# 🌐 Deployment
This project can be deployed on any server that supports Java 17.
The Gradle build produces a runnable JAR with:
```bash
  ./gradlew build
```
---

# 🤝 Contributions

Contributions are welcome. Please fork the repository and submit pull requests following standard GitHub practices.
