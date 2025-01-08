# Inventory

<!-- LOGO DEL PROYECTO -->
<br />
<div align="center">
  <a href="#">
    <img src="https://www.qindel.com/wp-content/uploads/2023/04/spring-boot.jpeg" alt="Logo" width="500">
  </a>
</div>

## About The Project

`Inventory` is a backend application built with **Spring Boot** and **Maven plugin** to showcase advanced backend development skills. This application designed to administer an inventory systems that witch can to do CRUD and connect with database , with support for exporting results in JSON:


This project serves as a practical demonstration of my expertise in server-side programming and test.

---

## Features

- **API Integration**:
    - Available endpoints:
        - `/inventory/getAll`: Get all items
        - `/inventory/getOne`: Get just one item
        - `/inventory/create`: Create item
        - `/inventory/update`: Update item
        - `/inventory/deleteOne`: Delete just one item

---

## Technologies Used

- **Language**: Java
- **Framework**: [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
- **Configuration**: `application.properties`

---

## Installation

### Prerequisites

1. [JDK 17+](https://adoptium.net/)
2. [Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
3. [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/Thecode42/Inventory01.git
   cd 
2. Start the application:
   ```bash
   ./mvn install

### Usage
### Available Endpoints

1. GET /inventory/getAll:
   - **Description:** Get all items.
     - **Response:**
        ```bash
              [
                {
                "id": 1,
                "name": "Toothpaste Colgate White",
                "price": 2.45,
                "stock": 24,
                "status": 1
                },
                {
                "id": 2,
                "name": "Toothsticks Simple",
                "price": 0.35,
                "stock": 38,
                "status": 1
                }
                ...
              ]
       ```
2. POST /inventory/getOne:
    - **Description:** Create one item.
        - **Request:**
           ```bash
                 {
                    "id": 8
                    }
          ```
        - **Response:**
           ```bash
                 {
                  "id": 8,
                  "name": "Candy red - bag",
                  "price": 6.12,
                  "stock": 67,
                  "status": 0
                  }
          ```
3. POST /inventory/create:
    - **Description:** Create one item.
        - **Request:**
           ```bash
                 {
                    "name": "Candy blue - bag New",
                    "price": 6.12,
                    "stock": 23
                    }
          ```
        - **Response:**
           ```bash
                 {
                  "id": 13,
                  "name": "Candy blue - bag New",
                  "price": 6.25,
                  "stock": 23,
                  "status": 1
                 }
          ```
4. POST /inventory/update:
    - **Description:** Update one item.
        - **Request:**
           ```bash
                 {
                  "id": 8,
                  "name": "Candy red - bag",
                  "price": 6.12,
                  "stock": 67
                   }
          ```
        - **Response:**
           ```bash
                 {
                  "id": 8,
                  "name": "Candy red - bag",
                  "price": 6.12,
                  "stock": 67,
                  "status": 0
                  }
          ```
5. POST /inventory/deleteOne:
    - **Description:** Update one item.
        - **Request:**
           ```bash
                 {
                  "id": 13
                   }
          ```
        - **Response:**
           ```bash
                 {
                  "message": "Item has been deleted successfully"
                  }
          ```
### Project Structure
```bash
    Inventory01/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── inventory/
    │   │   │           ├── controllers/
    │   │   │           │   ├── InventoryController.java
    │   │   │           ├── dto/
    │   │   │           │   ├── ItemDTO.java
    │   │   │           ├── entities/
    │   │   │           │   ├── ItemEntity.java
    │   │   │           ├── repositories/
    │   │   │           │   └── ItemRepository.java
    │   │   │           ├── services/
    │   │   │           │   └── ItemServices.java
    │   │   │           └── Inventory01Application.java
    │   └── resources/
    │       └── application.properties
    
```
## License

This project is licensed under the MIT License. Please consult the `LICENSE` file for more details.
