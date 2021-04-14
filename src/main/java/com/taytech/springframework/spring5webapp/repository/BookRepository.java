package com.taytech.springframework.spring5webapp.repository;

import com.taytech.springframework.spring5webapp.model.BookEntity;
import com.taytech.springframework.spring5webapp.model.BookPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, BookPK> {
}
