package com.taytech.springframework.spring5webapp.mapper;

import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PublisherMapper {

    PublisherDto convertPublisherEntityToPublisherDto(PublisherEntity publisherEntity);

    PublisherEntity convertPublisherDtoToPublisherEntity(PublisherDto publisherDto);
}
