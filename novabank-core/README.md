# NovaBank Core

## Overview

NovaBank Core serves as the Data Access Layer (DAL) for managing interactions between the application and underlying data storage. It offers a standardized, efficient interface for data access and manipulation while maintaining data consistency, security, and scalability, all while adhering to South African financial regulations.

## Features

- **Data Abstraction**: Decouples application logic from the underlying data structure, enabling seamless adaptability to database changes.
- **CRUD Operations**: Full support for Create, Read, Update, and Delete operations.
- **Data Validation**: Ensures data consistency and integrity through built-in validation mechanisms.
- **Error Handling**: Robust mechanisms for error detection, logging, and handling.

## Technical Stack

- **Programming Language**: Java 11+
- **Build Tool**: Gradle 6.7+
- **Scheduler**: Quartz Scheduler for job scheduling and task management
- **ORM**: Hibernate 5.4+ for object-relational mapping
- **Spring Configurations**: Spring Framework 5.3+ for dependency injection and application configuration
- **Unit Testing**: JUnit 5.7+ for robust unit testing
- **Data Access**: Spring Data JPA for repository and data management
- **Connection Pooling**: HikariCP 4.0+ for efficient database connection pooling

## Domain Models

![Diagram: Domain Model Relationships](./images/nova_bank_models.png)

### 1. Account

- **Attributes**: Account number, account holder, balance, transaction history.
- **Use Cases**: Supports savings, current, and special-purpose accounts for retail and business banking.

### 2. Transaction

- **Attributes**: Transaction date, amount, type (deposit/withdrawal), description.
- **Use Cases**: Handles daily financial activities, supporting real-time and batch processing.

### 3. Customer

- **Attributes**: Customer ID, name, address, contact information.
- **Use Cases**: Central to identifying and managing client information and relationships.

### 4. Loan

- **Attributes**: Loan ID, customer ID, loan amount, interest rate, repayment schedule.
- **Use Cases**: Manages personal loans, home loans, and vehicle financing.

### 5. Credit Card

- **Attributes**: Credit card number, customer ID, credit limit, transaction history.
- **Use Cases**: Facilitates credit purchases, payment tracking, and billing.

## Benefits

- **Scalability**: Built for large-scale, high-performance banking applications.
- **Compliance**: Fully compliant with South African banking regulations.
- **Security**: Incorporates best practices in data security and encryption.
- **Flexibility**: Easily extensible to adapt to new banking products and services.

## Interest Rate Module (South Africa)

![Diagram: Interest Rate Module Components] Pending...

### Components

1. **Account-Specific Interest Policies**: Supports Savings, Fixed Deposit, and specialized accounts.
2. **Interest Calculation Engine**: Unified logic for simple and compound interest calculation.
3. **Rate Management**: Centralized, configurable storage for interest rates.

## License

NovaBank Core is released under the CLOSED-SOURCE License. Refer to the LICENSE file for detailed terms.

## Contact

For any questions, issues, or feedback, please contact the NovaBank Core team: core@novabank.co.za.
