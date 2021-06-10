package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * This class uses the Mapstruct library to map the book entity to the book dto and vice versa
 */
@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mappings({
            @Mapping(target = "recordCreateTime", source = "createdDate"),
            @Mapping(target = "bookId", source = "id"),
    })
    BookEntity convertBookDtoToEntity(BookDto bookDto);


   @Mappings({
           @Mapping(target = "id", source = "bookId"),
           @Mapping(target = "createdDate", source = "recordCreateTime")
   })
BookDto convertBookEntityToBookDto(BookEntity bookEntity);
}
