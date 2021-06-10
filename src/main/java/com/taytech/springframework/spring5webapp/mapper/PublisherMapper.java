package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * This class uses the Mapstruct library to map the publisher entity to the publisher dto and vice versa
 */
@Mapper(componentModel = "spring")
public interface PublisherMapper {
    PublisherDto convertPublisherEntityToDto(PublisherEntity publisherEntity);

    PublisherEntity convertPublisherDtoToEntity(PublisherDto publisherDto);
}
