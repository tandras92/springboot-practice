package com.taytech.springframework.spring5webapp.repository;

import com.taytech.springframework.spring5webapp.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
