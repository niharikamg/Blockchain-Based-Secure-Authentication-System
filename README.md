# 🔐 Blockchain-Based Secure Authentication System

## 📌 Overview
This project is a **decentralized authentication system** that securely verifies users using **Ethereum blockchain and Spring Boot**. It eliminates passwords and enables **secure, blockchain-based logins**.

## 🚀 Features
- ✅ **Decentralized Identity Verification** – Users authenticate using **blockchain wallets**.
- ✅ **Zero-Trust Security** – No passwords stored, ensuring **maximum security**.
- ✅ **JWT-Based API Authentication** – Secure backend communication.
- ✅ **Ethereum Smart Contracts** – Stores authentication data on blockchain.
- ✅ **Role-Based Access Control (RBAC)** – Admin and user access control.
- ✅ **Docker Support** – Easily deploy using Docker Compose.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Blockchain:** Ethereum + Solidity  
- **Database:** PostgreSQL  
- **Authentication:** JWT + Metamask Integration  
- **Containerization:** Docker & Docker Compose  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/authblockchain/
│   │   ├── Application.java
│   │   ├── controller/AuthController.java
│   │   ├── service/BlockchainAuthService.java
│   │   ├── service/JWTUtil.java
│   │   ├── model/User.java
│   │   ├── config/SecurityConfig.java
│   ├── resources/application.properties
├── blockchain/
│   ├── AuthContract.sol
├── database/
│   ├── schema.sql
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/Blockchain-Based-Secure-Authentication.git
cd Blockchain-Based-Secure-Authentication
```

### **2️⃣ Deploy the Smart Contract (Ethereum)**
```bash
cd blockchain
truffle compile
truffle migrate --network rinkeby
```

### **3️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **4️⃣ Run Everything Using Docker (Recommended)**
```bash
docker-compose up --build
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint            | Description                 |
|--------|---------------------|-----------------------------|
| POST   | `/api/auth/login`  | Authenticate user via blockchain |

### **Example API Request**
```json
POST /api/auth/login
{
  "walletAddress": "0x1234567890abcdef1234567890abcdef12345678",
  "role": "User"
}
```
#### **Example API Response**
```json
{
  "message": "User authenticated via blockchain!"
}
```

## 📝 Future Enhancements
- 🔒 **JWT Authentication** for API security  
- 📊 **Blockchain-Based Access Control** for enterprises  
- 🤖 **Metamask & WalletConnect Integration** for frontend  

---

  

🚀 **Like this project? Star it on GitHub!** ⭐  
