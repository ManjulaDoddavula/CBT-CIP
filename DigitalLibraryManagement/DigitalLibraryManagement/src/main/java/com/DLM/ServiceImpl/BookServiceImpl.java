package com.DLM.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DLM.Entity.BookPojo;
import com.DLM.Entity.MemberPojo;
import com.DLM.Exception.BookNotFoundException;
import com.DLM.Repo.BookRepo;
import com.DLM.Repo.MemberRepo;
import com.DLM.Service.BookService;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

	@Autowired
    private BookRepo bookRepository;

	@Autowired
	private MemberRepo memberRepository;	
	
	@Override
	public BookPojo addBook(BookPojo book) {
	    if (book.getMember() != null && book.getMember().getId() != null) {
	        MemberPojo member = memberRepository.findById(book.getMember().getId())
	                             .orElseThrow(() -> new EntityNotFoundException("Member not found"));
	        book.setMember(member);
	    } else {
	        throw new IllegalArgumentException("Member information is required");
	    }

	    log.info(book.toString());
	    
	    return bookRepository.save(book);
	}
	
	@Override
	public BookPojo updateBook(Long id, BookPojo book) {
		BookPojo existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setCategory(book.getCategory());
        existingBook.setAvailable(book.isAvailable());
        existingBook.setIssued(book.isIssued());
        log.info(book.toString());
        return bookRepository.save(existingBook);
    }
	
	@Override
	public Object deleteBook(Long id) {
        bookRepository.deleteById(id);
        return id;
    }
	
	@Override
	public BookPojo getBookById(Long id) {
		Optional<BookPojo> b = bookRepository.findById(id);
		log.info(b.toString());
		return b.orElseThrow(() -> new RuntimeException("Book not found"));
    }

	@Override
	public BookPojo getBookByName(String bookname) {
		Optional<BookPojo> b = bookRepository.findByTitle(bookname);
		log.info(b.toString());
        return b.orElseThrow(() -> new BookNotFoundException("Book not found"));
    }
	
	@Override
	public List<BookPojo> getAllBooks() {
		List<BookPojo> b = bookRepository.findAll();
		log.info(b.toString());
        return b;
    }
	
	@Override
	public boolean issueBook(Long bookId, Long memberId) {
		BookPojo book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        MemberPojo member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("Member not found"));
        if (book.isAvailable() && !book.isIssued()) {
            book.setAvailable(false);
            book.setIssued(true);
            book.setMember(member);
            bookRepository.save(book);
            return true;
        }
        return false;
    }

	@Override
    public boolean returnBook(Long bookId, Long memberId) {
    	 BookPojo book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
         MemberPojo member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("Member not found"));
         if (book.isIssued() && book.getMember().equals(member)) {
             book.setAvailable(true);
             book.setIssued(true); book.setIssued(false);
             book.setMember(null);
             bookRepository.save(book);
             return true;
         }
         return false;
    }	
}