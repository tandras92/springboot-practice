package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.model.AuthorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * This class uses the Mapstruct library to map the author entity to the author dto and vice versa
 */
@Mapper(componentModel = "spring")
public interface AuthorMapper {

    @Mapping(target = "bookDtos", source = "books")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    AuthorDto convertAuthorEntityToDto(AuthorEntity authorEntity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "books", source = "bookDtos")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    AuthorEntity convertAuthorDtoToEntity(AuthorDto authorDto);
}
