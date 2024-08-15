package com.DLM.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DLM.Entity.BookPojo;
import com.DLM.Entity.MemberPojo;
import com.DLM.Service.BookService;
import com.DLM.Service.MemberService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/addbook")
    public ResponseEntity<BookPojo> addBook(@RequestBody BookPojo book) {
        BookPojo savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @PutMapping("/updatebook/{id}")
    public ResponseEntity<BookPojo> updateBook(@PathVariable Long id, @RequestBody BookPojo book) {
        BookPojo updatedBook = bookService.updateBook(id, book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deletebook/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<Object>(id+": deleted successfully" , HttpStatus.NO_CONTENT);
    }

    @PostMapping("/addmember")
    public ResponseEntity<MemberPojo> addMember(@RequestBody MemberPojo member) {
        MemberPojo savedMember = memberService.addMember(member);
        return ResponseEntity.ok(savedMember);
    }

    @PutMapping("/updatemember/{id}")
    public ResponseEntity<MemberPojo> updateMember(@PathVariable Long id, @RequestBody MemberPojo member) {
        MemberPojo updatedMember = memberService.updateMember(id, member);
        return ResponseEntity.ok(updatedMember);
    }

    @DeleteMapping("/deletemember/{id}")
    public ResponseEntity<Object> deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return new ResponseEntity<Object>(id+": deleted successfully" , HttpStatus.NO_CONTENT);
    }   
}