package com.taytech.springframework.spring5webapp.repository;

import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, UUID> {
}
