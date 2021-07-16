package com.springframework.bookinfo.repositories;

import com.springframework.bookinfo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
