package com.taytech.springframework.spring5webapp.service;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.model.AuthorEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface AuthorService {
    AuthorDto findAuthorByLastName(AuthorDto authorDto);

    void processEvent(AuthorDto authorDto);

    AuthorEntity convertAuthorsToEntity(final AuthorDto authorDto);

    AuthorDto convertEntityToAuthorDto (final AuthorEntity authorEntity);

    Set<AuthorDto> convertAuthorEntityToDtos (final Set<AuthorEntity> authors);
}
