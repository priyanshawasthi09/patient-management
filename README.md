# **HealthSync – Patient Management System**  

---

## **📌 Introduction**  
**HealthSync** is a **Patient Management System** built to solve real-world healthcare workflow challenges.  
It follows a **microservices architecture** to ensure **modularity, scalability, and ease of deployment**.

**Highlights:**  
- **Centralized Authentication & Routing** to streamline access control and service coordination.  
- **Containerized Microservices** for consistent environments and simplified deployments.  
- **Efficient Communication** using **gRPC** and **Kafka** for event-driven messaging.  
- **Cloud-ready Setup** with Docker-based services and PostgreSQL as database containers.  


---

## 🌟 GirlScript Summer of Code (GSSoC) 2025 
![GSSoC Logo](https://github.com/dimpal-yadav/patient-management/blob/GSSocC-Banner/GSSoC.png)

🌟 **Exciting News...**

🚀 This project is now an official part of GirlScript Summer of Code – GSSoC'25! 💻 We're thrilled to welcome contributors from all over India and beyond to collaborate, build, and grow *patient-management!* Let’s make learning and career development smarter – together! 🌟

👩‍💻 GSSoC is one of India’s **largest 3-month-long open-source programs** that encourages developers of all levels to contribute to real-world projects 🌍 while learning, collaborating, and growing together. 🌱

🌈 With **mentorship, community support**, and **collaborative coding**, it's the perfect platform for developers to:

- ✨ Improve their skills
- 🤝 Contribute to impactful projects
- 🏆 Get recognized for their work
- 📜 Receive certificates and swag!

🎉 **I can’t wait to welcome new contributors** from GSSoC 2025 to this patient-management project family! Let's build, learn, and grow together — one commit at a time. 🔥

---

## **🛠️ Tools & Technologies**  
- **Backend:** Java 17, Spring Boot  
- **Security:** JWT Authentication  
- **Communication:** gRPC, Kafka  
- **Databases:** PostgreSQL (Dockerized)  
- **Infrastructure:** Docker, Docker Compose  
- **Gateway:** API Gateway for routing  
- **Testing:** Postman (API Testing)  
- **API FLOW:** Swagger (Integrated)
---

## 📂 Project Structure
```
patient-management/
│
├── analytics-service/ # Handles data analytics
├── api-gateway/ # Central gateway for routing
├── api-requests/ # API request definitions
├── auth-service/ # Authentication and user management
├── billing-service/ # Billing and payments
├── grpc-requests/ # gRPC request definitions
├── integration-tests/ # End-to-end integration tests
├── patient-service/ # Core patient management
├── README.md # Project documentation
├── LICENSE # License file
└── patient-management.iml # IntelliJ project config
```

---

## 📌 Visual Representation

![📂 Project Structure](https://drive.google.com/uc?export=view&id=1euDemxVIXVT7AUBUMAnu0g8sPjhoVy6c)


---

## **⚙️ Setup & Workflow**  

### **Prerequisites**  
- Java 17  
- IntelliJ IDEA (Preferred)  
- Docker Desktop  
- Postman (For API Testing)  

---

## **🚀 Run Workflow**  
```bash
# Clone the repository
git clone https://github.com/harshakumari21/patient-management.git

# Open in IntelliJ IDEA and configure Docker integration
# Ensure Docker is running and network mode is set to: --network internal

# Run microservices via Docker Compose or IntelliJ Docker configs

# After Full execution API code will be present at - localhost:4004/api-docs/patients
# Paste that in Swagger Editor for API Flow execution
```

---

## **Microservices and Docker Configurations**

## Patient-Service
**Envrionment Variables**

BILLING_SERVICE_ADDRESS=billing-service  
BILLING_SERVICE_GRPC_PORT=9001  
SPRING_DATASOURCE_PASSWORD=password  
SPRING_DATASOURCE_URL=jdbc:postgresql://patient-service-db:5432/db  
SPRING_DATASOURCE_USERNAME=admin  
SPRING_JPA_HIBERNATE_DDL_AUTO=update  
SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9092  
SPRING_SQL_INIT_MODE=always  

## Billing Service
**Bind Ports**

4001:4001  
9001:9001 (gRPC)  

## Auth Service
**Envrionment Variables**

JWT_KEY=your_jwt_key  
SPRING_DATASOURCE_PASSWORD=password  
SPRING_DATASOURCE_URL=jdbc:postgresql://auth-service-db:5432/db  
SPRING_DATASOURCE_USERNAME=admin  
SPRING_JPA_HIBERNATE_DDL_AUTO=update  
SPRING_SQL_INIT_MODE=always  

## API GATEWAY
**Bind Ports**

4004:4004

**Envrionment Variables**

AUTH_SERVICE_URL=http://auth-service:4005  

## Analytics-Service
**Bind Ports**

4002:4002

**Environment Variables**

SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9092  

## Patient-Service-DB
**Bind Ports**

5000:5432

**Bind Mount**

Host Path - C:\Users\priya\IdeaProjects\patient-management\patient-service\db_modules
Container Path - \var\lib\postgresql\ (name this as - \data\postgres\SQL)
(Choose Any Path you desire for both and naming the paths are also allowed)

**Environment Variables**

POSTGRES_DB=db  
POSTGRES_PASSWORD=password  
POSTGRES_USER=admin 

## Auth-Service-DB
**Bind Ports**

5001:5432

**Bind Mount**

Host Path - C:\Users\priya\IdeaProjects\patient-management\auth-service\db_modules
Container Path - \var\lib\postgresql\data (name this as - \data\postgres\SQL)
(Choose Any Path you desire for both and naming the paths are also allowed)

**Environment Variables**

POSTGRES_DB=db  
POSTGRES_PASSWORD=password  
POSTGRES_USER=admin  

## Kafka
**Bind Ports**

9092:9092  
9094:9094

**Environment Variables**

KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092,EXTERNAL://localhost:9094  
KAFKA_CFG_CONTROLLER_LISTENER_NAMES=CONTROLLER  
KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=0@kafka:9093  
KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,EXTERNAL:PLAINTEXT,PLAINTEXT:PLAINTEXT  
KAFKA_CFG_LISTENERS=PLAINTEXT://:9092,CONTROLLER://:9093,EXTERNAL://:9094  
KAFKA_CFG_NODE_ID=0  
KAFKA_CFG_PROCESS_ROLES=controller,broker  

---

## **✅ Key Learnings**
- Designed a scalable microservices system with independent deployments.
- Implemented secure authentication with JWT.
- Used Dockerized PostgreSQL databases for isolated development.
- Integrated Kafka messaging and gRPC for efficient communication.

---
