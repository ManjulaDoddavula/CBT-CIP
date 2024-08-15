# BankyApplication

BankyApplication is a simple banking system built using Spring Boot. This application allows users to create bank accounts, deposit and withdraw funds, and transfer funds between accounts. It also includes a Swagger UI for easy API testing and documentation.

## Features

- **Create a new bank account:** Users can create a bank account with an initial deposit.
- **Deposit funds:** Users can deposit funds into their bank accounts.
- **Withdraw funds:** Users can withdraw funds from their bank accounts, provided they maintain a minimum balance of 500.
- **Transfer funds:** Users can transfer funds between different bank accounts.
- **View all accounts:** Retrieve a list of all bank accounts.
- **View account by ID:** Retrieve the details of a specific bank account by its ID.

## Technologies Used

- **Spring Boot:** Framework for building the application.
- **Spring Data JPA:** For database operations.
- **MySQL:** Database for persisting data.
- **Swagger/OpenAPI:** For API documentation and testing.
- **Jakarta Validation:** For validating inputs such as the minimum balance.

## Setup and Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/ManjulaDoddavula/CBT-CIP/BankyApplication.git
   cd BankyApplication

2. **Database Configuration:**

Make sure you have MySQL installed and running. Update the database configuration in src/main/resources/application.properties:
	spring.datasource.url=jdbc:mysql://localhost:3306/bankapp
	spring.datasource.username=root
	spring.datasource.password=root
Ensure that the database bankapp exists in your MySQL server.

3. **Build and Run the Application:**

Use Maven to build and run the application:

	mvn clean install
	mvn spring-boot:run

4. **Access the Application:**

API Documentation: The Swagger UI is available at http://localhost:8085/swagger-ui.html.
API Endpoints: Access the API at http://localhost:8085/api/accounts.

**API Endpoints**

Bank Account Management

Create a new bank account:

POST /api/accounts/create
Parameters: accountHolderName (String), initialDeposit (BigDecimal)
Get all bank accounts:

GET /api/accounts
Get a bank account by ID:

GET /api/accounts/{id}
Deposit funds into an account:

POST /api/accounts/{id}/deposit
Parameters: amount (BigDecimal)
Withdraw funds from an account:

POST /api/accounts/{id}/withdraw
Parameters: amount (BigDecimal)
Transfer funds between accounts:

POST /api/accounts/transfer
Parameters: fromAccountId (Long), toAccountId (Long), amount (BigDecimal)
Project Structure
BankAccount Entity: Represents a bank account with properties like id, accountHolderName, and balance.
BankAccountRepository: Interface for performing CRUD operations on the BankAccount entity.
BankAccountService: Contains business logic for creating accounts, depositing, withdrawing, and transferring funds.
BankAccountController: REST controller for handling HTTP requests related to bank accounts.

