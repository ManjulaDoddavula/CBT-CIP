package com.DLM.Exception;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String message) {
        super(message);
    }
}
