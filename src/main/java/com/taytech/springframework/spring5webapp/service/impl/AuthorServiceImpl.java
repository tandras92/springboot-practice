package com.taytech.springframework.spring5webapp.service.impl;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.mapper.AuthorMapper;
import com.taytech.springframework.spring5webapp.model.AuthorEntity;
import com.taytech.springframework.spring5webapp.repository.AuthorRepository;
import com.taytech.springframework.spring5webapp.service.AuthorService;
import org.springframework.stereotype.Component;

@Component
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }


    @Override
    public AuthorDto findAuthorByLastName(AuthorDto authorDto) {
        return convertEntityToAuthorDto((AuthorEntity) authorRepository
                .findAuthorEntityByLastName(authorDto.getLastName()));
    }

    @Override
    public void processEvent(AuthorDto authorDto) {
        saveAuthor(authorDto);
    }

    @Override
    public AuthorEntity convertAuthorsToEntity(AuthorDto authorDto) {
        return authorMapper.convertAuthorDtoToEntity(authorDto);
    }

    @Override
    public AuthorDto convertEntityToAuthorDto(AuthorEntity authorEntity) {
        return authorMapper.convertAuthorEntityToDto(authorEntity);
    }

    private void saveAuthor(final AuthorDto authorDto) {
        AuthorEntity authorResults = convertAuthorsToEntity(authorDto);

        try {
            authorRepository.saveAndFlush(authorResults);
        } catch (Exception e) {
            System.out.println("error in author service impl");
        }
    }
}
