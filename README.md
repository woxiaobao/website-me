# MyApp Project

[English](#english) | [中文](#chinese)

<a name="english"></a>
## 🌟 Overview
A comprehensive Spring Boot application featuring Redis integration, Swagger documentation, and Excel processing capabilities.

## 🛠 Technology Stack
- **Framework**: Spring Boot
- **API Documentation**: Swagger 3.0 (OpenAPI)
- **Logging**: Logback
- **Documentation**: Swagger/OpenAPI
- **Build Tool**: Maven
- **Containerization**: Docker

## 📁 Project Structure
```
src/main/java/org/start/app/
├── config/         # Configuration classes (Swagger, Redis, etc.)
├── controller/     # REST API controllers
├── service/        # Business logic implementation
├── model/          # Data models/DTOs
├── filter/        # Request filters
```

## 🚀 Getting Started

### Prerequisites
- JDK 8 or higher
- Maven
- Docker (optional)
- Redis

### Running Locally
1. Clone the repository
2. Build the project:
   ```bash
   mvn clean package
   ```
3. Run the application:
   ```bash
   java -jar target/myapp.jar
   ```

### 🐳 Docker Deployment
1. Build Docker image:
   ```bash
   docker build -t myapp .
   ```
2. Run container:
   ```bash
   docker run -p 8080:8080 myapp
   ```

## 📚 API Documentation
Access Swagger UI: http://localhost:8080/swagger-ui/index.html

---

<a name="chinese"></a>
# MyApp 项目

## 🌟 项目概述
一个综合性的Spring Boot应用，集成了Redis、Swagger文档和Excel处理等功能。

## 🛠 技术栈
- **框架**: Spring Boot
- **API文档**: Swagger 3.0 (OpenAPI)
- **日志系统**: Logback
- **文档**: Swagger/OpenAPI
- **构建工具**: Maven
- **容器化**: Docker

## 📁 项目结构
```
src/main/java/org/start/app/
├── config/         # 配置类（Swagger等）
├── controller/     # REST API控制器
├── service/        # 业务逻辑实现
├── filter/        # 请求过滤器
```

## 🚀 快速开始

### 环境要求
- JDK 8 或更高版本
- Maven
- Docker（可选）

### 本地运行
1. 克隆仓库
2. 构建项目：
   ```bash
   mvn clean package
   ```
3. 运行应用：
   ```bash
   java -jar target/myapp.jar
   ```

### 🐳 Docker部署
1. 构建Docker镜像：
   ```bash
   docker build -t myapp .
   ```
2. 运行容器：
   ```bash
   docker run -p 8080:8080 myapp
   ```

## 📚 API文档
访问Swagger UI：http://localhost:8080/swagger-ui/index.html 