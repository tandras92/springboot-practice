package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.model.AuthorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {

    AuthorDto convertAuthorEntityToDto(AuthorEntity authorEntity);

    AuthorEntity convertAuthorDtoToEntity(AuthorDto authorDto);
}
