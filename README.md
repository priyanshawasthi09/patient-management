# **HealthSync – Patient Management System**  

**Author:** [Harsha Kumari](https://www.linkedin.com/in/harshakumari/)  
**GitHub:** [harshakumari21](https://github.com/harshakumari21)  

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

## **🛠️ Tools & Technologies**  
- **Backend:** Java 17, Spring Boot  
- **Security:** JWT Authentication  
- **Communication:** gRPC, Kafka  
- **Databases:** PostgreSQL (Dockerized)  
- **Infrastructure:** Docker, Docker Compose  
- **Gateway:** API Gateway for routing  
- **Testing:** Postman (API Testing)  

---

## 📂 Project Structure
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

---

**Visual Representation:**  
![Project Structure](https://drive.google.com/file/d/1pwc53OUES8xskXLstki3fAmaT4ycNLWN/view?usp=sharing )  

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

## **Patient Service**
```bash
## 🌍 Environment Variables & Bind Ports

### **Patient-Service**
**Environment Variables**
```env
BILLING_SERVICE_ADDRESS=billing-service
BILLING_SERVICE_GRPC_PORT=9001
SPRING_DATASOURCE_PASSWORD=password
SPRING_DATASOURCE_URL=jdbc:postgresql://patient-service-db:5432/db
SPRING_DATASOURCE_USERNAME=admin
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9092
SPRING_SQL_INIT_MODE=always

