package com.springframework.bookinfo.repositories;

import com.springframework.bookinfo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
