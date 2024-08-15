package com.DLM.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DLM.Entity.BookPojo;
@Repository
public interface BookRepo extends JpaRepository<BookPojo, Long> {

	public abstract Optional<BookPojo> findByTitle(String bookname);
}
