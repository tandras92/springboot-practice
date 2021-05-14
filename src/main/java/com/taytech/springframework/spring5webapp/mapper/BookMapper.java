package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "recordCreateTime", source = "createdDate")
    @Mapping(target = "bookId", source = "uuid")
    @Mapping(target = "authors", source = "authorDtos")
    BookEntity convertBookDtoToEntity(BookDto bookDto);


    @Mapping(target = "uuid", source = "bookId")
    @Mapping(target = "createdDate", source = "recordCreateTime")
    @Mapping(target = "authorDtos", source = "authors")
    BookDto convertBookEntityToBookDto(BookEntity bookEntity);


}
