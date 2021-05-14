package com.taytech.springframework.spring5webapp.service;

import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import org.springframework.stereotype.Service;

@Service
public interface PublisherService {

    void processEvent(PublisherDto publisherDto);

    PublisherEntity convertPublisherDtoToEntity(final PublisherDto publisherDto);

    PublisherDto convertEntityToPublisherDto(final PublisherEntity publisherEntity);
}
