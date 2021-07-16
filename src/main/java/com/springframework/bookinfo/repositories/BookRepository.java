package com.springframework.bookinfo.repositories;

import com.springframework.bookinfo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
