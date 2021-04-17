package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

    BookDto convertBookEntityToBookDto(BookEntity bookEntity);

    BookEntity convertBookDtoToBookEntity(BookDto bookDto);
}
