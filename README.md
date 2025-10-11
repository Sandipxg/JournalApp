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
│   ├── ⚙️ service/              # Business Logic
│   │   ├── JournalEntryService.java
│   │   ├── UserService.java
│   │   └── UserDetailsServiceImpl.java
│   │
│   ├── 🔧 config/               # Configuration Files
│   │   ├── SecurityConfig.java
│   │   └── SpringSecurity.java
│   │
│   └── 🚀 JournalApplication.java # Main Application Class
│
└── 📄 pom.xml                   # Maven Dependencies
```

---

## 🛠️ Technologies Used

- ☕ **Java 17** - Programming language
- 🍃 **Spring Boot 3.x** - Application framework
- 🔐 **Spring Security** - Authentication and authorization
- 🗄️ **MongoDB** - NoSQL database
- 📦 **Maven** - Dependency management and build tool
- 🔑 **BCrypt** - Password encryption
- 📡 **REST API** - API architecture
- 🔗 **Lombok** - Reduce boilerplate code (optional)

---

## 🚀 Getting Started

### 📋 Prerequisites

- ☕ Java 17 or higher
- 📦 Maven 3.6+
- 🍃 MongoDB 4.4+
- 🔧 IDE (IntelliJ IDEA, Eclipse, or VS Code)

### ⚙️ Installation

1️⃣ **Clone the repository**
```bash
git clone https://github.com/Sandipxg/JournalApp.git
cd JournalApp
```

2️⃣ **Configure MongoDB**
- Ensure MongoDB is running on `localhost:27017`
- Or update the connection string in `application.properties`

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journalApp
```

3️⃣ **Build the project**
```bash
mvn clean install
```

4️⃣ **Run the application**
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

---

## 📡 API Overview

### 🔓 Public Endpoints

- 📝 **POST** `/public/create-user` - Register a new user

### 🔐 User Endpoints (Requires Authentication)

#### Journal Entry Management
- 📖 **GET** `/journal` - Get all journal entries for the logged-in user
- ➕ **POST** `/journal` - Create a new journal entry
- 🔍 **GET** `/journal/{id}` - Get a specific journal entry by ID
- ✏️ **PUT** `/journal/{id}` - Update a journal entry
- ❌ **DELETE** `/journal/{id}` - Delete a journal entry

#### User Management
- 👤 **GET** `/user` - Get current user details
- ✏️ **PUT** `/user` - Update user profile
- 🗑️ **DELETE** `/user` - Delete user account

### 👑 Admin Endpoints (Requires ADMIN Role)

- 👥 **GET** `/admin/all-users` - Get all users
- 🔧 **POST** `/admin/create-admin-user` - Create a new admin user

---

## 🔐 Security

The application implements robust security measures:

- 🔑 **Password Encryption** - All passwords are hashed using BCrypt
- 🛡️ **Spring Security** - Handles authentication and authorization
- 🎭 **Role-Based Access** - Different access levels for users and admins
- 🔒 **Session Management** - Secure session handling
- 🚫 **CSRF Protection** - Protection against cross-site request forgery
- 🌐 **HTTP Basic Authentication** - Secure API access

---

## 🗃️ Entities

### 📓 JournalEntry

```java
{
  "id": "ObjectId",
  "title": "String",
  "content": "String",
  "date": "LocalDateTime"
}
```

- 🆔 **id** - Unique identifier (MongoDB ObjectId)
- 📌 **title** - Title of the journal entry
- 📝 **content** - Content/body of the journal entry
- 📅 **date** - Timestamp of entry creation

### 👤 User

```java
{
  "id": "ObjectId",
  "userName": "String",
  "password": "String (encrypted)",
  "roles": ["String"],
  "journalEntries": ["JournalEntry"]
}
```

- 🆔 **id** - Unique identifier (MongoDB ObjectId)
- 👤 **userName** - Unique username
- 🔐 **password** - Encrypted password (BCrypt)
- 🎭 **roles** - User roles (USER, ADMIN)
- 📚 **journalEntries** - List of journal entries associated with the user

---

## 📝 Project Notes

### 🎯 Key Highlights

- ✅ **Clean Architecture** - Well-organized code structure following best practices
- ✅ **Security First** - Built with security as a priority
- ✅ **RESTful Design** - Follows REST API design principles
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

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. 🍴 Fork the repository
2. 🌿 Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔄 Open a Pull Request

---

## 📄 License

This project is open source and available under the MIT License.

---

## 👨‍💻 Author

**Sandip Gautam**
- 🐙 GitHub: [@Sandipxg](https://github.com/Sandipxg)

---

## 🙏 Acknowledgments

- 🍃 Spring Boot team for the amazing framework
- 🍃 MongoDB for the flexible database solution
- 💚 The open-source community for inspiration and support

---

<div align="center">

### ⭐ Star this repository if you find it helpful!

**Made with ❤️ by Sandip Gautam**

</div>
