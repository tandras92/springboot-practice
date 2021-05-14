package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PublisherMapper {

    @Mapping(target = "bookDtos", source = "books")
    PublisherDto convertPublisherEntityToDto(PublisherEntity publisherEntity);

    @Mapping(target = "books", source = "bookDtos")
    PublisherEntity convertPublisherDtoToEntity(PublisherDto publisherDto);
}
