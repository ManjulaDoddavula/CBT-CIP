package com.DLM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DLM.Entity.BookPojo;
import com.DLM.Service.BookService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/getallbooks")
    public ResponseEntity<List<BookPojo>> getAllBooks() {
        List<BookPojo> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/getbooksbyid/{id}")
    public ResponseEntity<BookPojo> getBookById(@PathVariable Long id) {
        BookPojo book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/getBookByName/{title}")
    public ResponseEntity<BookPojo> getBookByName(@PathVariable String title) {
        BookPojo book = bookService.getBookByName(title);
        return ResponseEntity.ok(book);
    }
    
    @PostMapping("/books/issue")
    public ResponseEntity<String> issueBook(@RequestParam Long bookId, @RequestParam Long memberId) {
        boolean isIssued = bookService.issueBook(bookId, memberId);
        if (isIssued) {
            return ResponseEntity.ok("Book issued successfully");
        } else {
            return ResponseEntity.status(400).body("Book cannot be issued");
        }
    }

    @PostMapping("/books/return")
    public ResponseEntity<String> returnBook(@RequestParam Long bookId, @RequestParam Long memberId) {
        boolean isReturned = bookService.returnBook(bookId, memberId);
        if (isReturned) {
            return ResponseEntity.ok("Book returned successfully");
        } else {
            return ResponseEntity.status(400).body("Book cannot be returned");
        }
    }
}