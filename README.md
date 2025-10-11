# 📔 JournalApp
## 📖 Introduction
JournalApp is a secure and feature-rich journaling application built with Spring Boot. This application allows users to create, manage, and organize their personal journal entries with robust security features and a RESTful API architecture. Whether you want to document your daily thoughts, track your progress, or maintain a personal diary, JournalApp provides a reliable platform for all your journaling needs.
---
## ✨ Features
- 📝 **Create Journal Entries** - Write and save your thoughts with ease
- 🔍 **Read Entries** - Access and view all your journal entries
- ✏️ **Update Entries** - Edit and modify existing journal entries
- 🗑️ **Delete Entries** - Remove unwanted entries from your journal
- 🔐 **User Authentication** - Secure user registration and login system
- 🔒 **Password Encryption** - BCrypt password hashing for enhanced security
- 👤 **User Management** - Complete user profile management
- 🛡️ **Role-Based Access Control** - Admin and user roles with different privileges
- 🌐 **RESTful API** - Clean and intuitive API endpoints
- 💾 **MongoDB Integration** - NoSQL database for flexible data storage
---
## 📂 Project Structure
```
JournalApp/
│
├── 📁 src/main/java/net/engineeringdigest/journalApp/
│   ├── 🎯 controller/          # REST API Controllers
│   │   ├── JournalEntryController.java
│   │   ├── UserController.java
│   │   └── PublicController.java
│   │
│   ├── 🗃️ entity/               # Data Models
│   │   ├── JournalEntry.java
│   │   └── User.java
│   │
│   ├── 💼 repository/           # Database Repositories
│   │   ├── JournalEntryRepository.java
│   │   └── UserRepository.java
│   │
│   ├── 🔧 service/              # Business Logic
│   │   ├── JournalEntryService.java
│   │   └── UserService.java
│   │
│   └── 📱 JournalApplication.java
│
├── 📁 src/main/resources/
│   └── ⚙️ application.properties  # Configuration
│
└── 📦 pom.xml                    # Dependencies
```
---
## 🚀 Getting Started
### 📋 Prerequisites
- ☕ Java 17 or higher
- 🍃 MongoDB 4.0 or higher
- 🔨 Maven 3.6 or higher
### ⚙️ Configuration
1. 📝 Update `application.properties` with your MongoDB connection string:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
```
### 🏃 Running the Application
1. 📥 Clone the repository:
```bash
git clone https://github.com/Sandipxg/JournalApp.git
```
2. 📂 Navigate to the project directory:
```bash
cd JournalApp
```
3. 🔨 Build the project:
```bash
mvn clean install
```
4. ▶️ Run the application:
```bash
mvn spring-boot:run
```
The application will start on `http://localhost:8080`
---
## 🔌 API Endpoints
### 🔓 Public Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/public/create-user` | Register a new user |
### 🔐 Authenticated Endpoints
#### 📔 Journal Entry Operations
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/journal` | Create a new journal entry |
| GET | `/journal` | Get all entries for logged-in user |
| GET | `/journal/{id}` | Get specific journal entry |
| PUT | `/journal/{id}` | Update a journal entry |
| DELETE | `/journal/{id}` | Delete a journal entry |
#### 👤 User Operations
| Method | Endpoint | Description |
|--------|----------|-------------|
| PUT | `/user` | Update user information |
| DELETE | `/user` | Delete user account |
---
## 🛠️ Technologies Used
- ☕ **Java 17** - Programming language
- 🍃 **Spring Boot** - Application framework
- 🔐 **Spring Security** - Authentication and authorization
- 🍃 **Spring Data MongoDB** - Database integration
- 💾 **MongoDB** - NoSQL database
- 🔒 **BCrypt** - Password encryption
- 🌐 **REST API** - API architecture
- 🔨 **Maven** - Build tool
---
## 🔐 Security Features
- 🔑 BCrypt password hashing
- 🛡️ Role-based access control (RBAC)
- 🔒 Secured API endpoints
- 👤 User-specific data access
- 🔐 Authentication required for sensitive operations
---
## 📝 Journal Entry Features
- Full CRUD operations supported
- Entries are automatically associated with the logged-in user
- Timestamp tracking for all entries
---
## 🎨 Why JournalApp?
- ✅ **Production-Ready** - Built with enterprise-grade frameworks
- ✅ **Secure** - Industry-standard security practices
- ✅ **RESTful Design** - Clean and maintainable API structure
- ✅ **Scalable** - Easy to extend and add new features
- ✅ **MongoDB Integration** - Flexible NoSQL database for dynamic data
### 🚧 Future Enhancements
- 🏷️ Tags and categories for journal entries
- 🔍 Advanced search and filtering
- 📊 Analytics and insights
- 📱 Mobile application
- 🌙 Dark mode support
- 📧 Email notifications
- ☁️ Cloud storage integration
- 🔄 Entry versioning and history
---
## 👨‍💻 Author
**Sandip Godhani**
- 🐙 GitHub: [@Sandipxg](https://github.com/Sandipxg)
---
<div align="center">

### ⭐ Star this repository if you find it helpful!
**Made with ❤️ by Sandip Godhani**

</div>
