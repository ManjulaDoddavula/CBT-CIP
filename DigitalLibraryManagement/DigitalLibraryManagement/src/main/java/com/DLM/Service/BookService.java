package com.DLM.Service;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import com.DLM.Entity.BookPojo;

public interface BookService {

	public abstract BookPojo addBook(BookPojo book);
	
	public abstract BookPojo updateBook(Long id, BookPojo book);
	
	public abstract Object deleteBook(Long id);
	
	public abstract BookPojo getBookById(Long id);

	public abstract BookPojo getBookByName(String bookname);
	
	public abstract List<BookPojo> getAllBooks();
	
	public abstract boolean issueBook(Long bookId, Long memberId);

    public abstract boolean returnBook(Long bookId, Long memberId);
}