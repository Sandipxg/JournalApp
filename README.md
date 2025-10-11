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
## 🛠️ Tech Stack
- ☕ **Java 17** - Core programming language
- 🍃 **Spring Boot 3.x** - Application framework
- 🔐 **Spring Security** - Authentication and authorization
- 🗄️ **MongoDB** - NoSQL database
- 🏗️ **Maven** - Build tool
- 🔑 **BCrypt** - Password encryption
- 📊 **Lombok** - Reduce boilerplate code
---
## 🚀 Getting Started
### 📋 Prerequisites
- ☕ Java 17 or higher
- 🗄️ MongoDB installed and running
- 🏗️ Maven 3.6+
### 🔧 Installation
1. 📥 **Clone the repository**
   ```bash
   git clone https://github.com/Sandipxg/JournalApp.git
   cd JournalApp
   ```
2. ⚙️ **Configure MongoDB**
   
   Update `application.properties` with your MongoDB connection details:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
   ```
3. 🏗️ **Build the project**
   ```bash
   mvn clean install
   ```
4. ▶️ **Run the application**
   ```bash
   mvn spring-boot:run
   ```
5. ✅ **Access the application**
   
   The application will be available at `http://localhost:8080`
---
## 📍 API Endpoints
### 🔐 Public Endpoints
```http
POST /public/signup          # Create new user account
POST /public/login           # User login
```
### 📔 Journal Entry Endpoints
```http
GET    /journal              # Get all journal entries for logged-in user
POST   /journal              # Create a new journal entry
GET    /journal/{id}         # Get a specific journal entry
PUT    /journal/{id}         # Update a journal entry
DELETE /journal/{id}         # Delete a journal entry
```
### 👤 User Endpoints
```http
GET    /user                 # Get all users (Admin only)
POST   /user                 # Create new user (Admin only)
PUT    /user                 # Update user profile
DELETE /user                 # Delete user account
```
---
## 🔒 Security Features
- ✅ **Password Encryption** - BCrypt hashing algorithm
- ✅ **JWT Authentication** - Secure token-based authentication
- ✅ **Role-Based Access** - Different permissions for Admin and User roles
- ✅ **Input Validation** - Server-side validation for all inputs
- ✅ **Secure APIs** - Protected endpoints with Spring Security
---
## 💡 Usage Example
### Creating a Journal Entry
```json
POST /journal
{
  "title": "My First Journal Entry",
  "content": "Today was an amazing day. I learned so much about Spring Boot!",
  "date": "2024-01-15"
}
```
### User Registration
```json
POST /public/signup
{
  "userName": "johndoe",
  "email": "john@example.com",
  "password": "securePassword123"
}
```
---
## 🎯 Key Features Explained
### 🔐 Authentication Flow
1. User signs up with username, email, and password
2. Password is encrypted using BCrypt
3. User logs in with credentials
4. JWT token is generated for secure API access
5. Token is validated for protected endpoints
### 📔 Journal Management
- Users can only access their own journal entries
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
**Sandip Godhani**
- 🐙 GitHub: [@Sandipxg](https://github.com/Sandipxg)
---
## 🙏 Acknowledgments
- 🍃 Spring Boot team for the amazing framework
- 🍃 MongoDB for the flexible database solution
- 💚 The open-source community for inspiration and support
---
<div align="center">

### ⭐ Star this repository if you find it helpful!
**Made with ❤️ by Sandip Godhani**

</div>
