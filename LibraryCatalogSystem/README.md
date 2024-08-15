# Library Catalog System

## Overview
The Library Catalog System is a simple web application built with Spring Boot. It allows users to add, search, and list books in a library. The data is stored in a MySQL database.

## Features
- **Add Book**: Enter a book's title and author to add it to the catalog.
- **Search**: Find books by title or author.
- **List Books**: View all books in the catalog.

## Setup

### Prerequisites
- Java 17 or later
- MySQL Server
- Maven

### Database
1. Create a MySQL database named `lcs`:
   ```sql
   CREATE DATABASE lcs;


###Running the Application

1. Clone the repository:

	git clone https://github.com/ManjulaDoddavula/CBT-CIP/LibraryCatalogSystem.git

2. Navigate to the project directory:

	cd LibraryCatalogSystem

3. Build and run the application using Maven:

	mvn spring-boot:run

###Endpoints

POST /api/books: Add a book.
GET /api/books/search/title: Search by title.
GET /api/books/search/author: Search by author.
GET /api/books: List all books.

 