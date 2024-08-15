Digital Library Management System

Project Overview:
The Digital Library Management System is a web-based application developed to automate the core functionalities of a library. The system provides an 
interface for both administrators and users, allowing for efficient management of books and members.

Objectives:

	To digitize the entire library management process, eliminating manual errors and inefficiencies.
	To provide a centralized system that manages books, members, transactions, and reports.
	To enhance the user experience by offering an intuitive and easy-to-use interface.
	To ensure data integrity, security, and accessibility through proper database management.

1. Modules:
	a. Admin Module:
	
		i. Manage Books:
			Admins can add, update, or delete book records.	Book details include title, author, category, availability status, and association with a member if issued.
		ii. Manage Members:
			Admins can add, update, or delete member records. Members must be registered before they can issue or return books.
		iii. Permissions:
			Admins have full control over the system, including the ability to modify or delete existing records.

	b. User Module:

		i. View Books or Book Browsing:
			Users can browse the library's collection and search for specific books by name.
		ii. Issue and Return Books:
			Registered users can issue and return books.
		iii. Member Registration:
			Users must be registered as members to interact with the book issuing and returning functionalities.


2. Implemented Endpoints:

	a. AdminController:

		i. addBook: Allows the admin to add a new book.
		ii. updateBook: Enables the admin to update existing book details.
		iii. deleteBook: Permits the admin to delete a book.
		iv. addMember: Admin can register a new member.
		v. updateMember: Admin can update member details.
		vi. deleteMember: Admin can delete a member record.

	b. UserController:

		i. getAllBooks: Fetches a list of all books in the library.
		ii. getBookById: Retrieves details of a book by its ID.
		iii. getBookByName: Allows users to search for a book by its name.
		iv. issueBook: Users can issue a book to themselves.
		v. returnBook: Users can return an issued book.

3. Project Requirements:

	a. Database Setup: The project requires a MySQL database for storing books and member information.
	b. Execution: The application is run on a local server, typically using Spring Boot with a web interface.

Note:
	A member must be registered in the database before they can be associated with a book. Only registered members can issue or return books.