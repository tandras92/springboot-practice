package com.taytech.springframework.spring5webapp.service.impl;

import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.mapper.PublisherMapper;
import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import com.taytech.springframework.spring5webapp.repository.PublisherRepository;
import com.taytech.springframework.spring5webapp.service.PublisherService;
import org.springframework.stereotype.Component;

@Component
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;
    private final PublisherMapper publisherMapper;

    public PublisherServiceImpl(PublisherRepository publisherRepository, PublisherMapper publisherMapper) {
        this.publisherRepository = publisherRepository;
        this.publisherMapper = publisherMapper;
    }


    @Override
    public void processEvent(PublisherDto publisherDto) {
        savePublisher(publisherDto);
    }

    @Override
    public PublisherEntity convertPublisherDtoToEntity(PublisherDto publisherDto) {
        return publisherMapper.convertPublisherDtoToEntity(publisherDto);
    }

    @Override
    public PublisherDto convertEntityToPublisherDto(PublisherEntity publisherEntity) {
        return publisherMapper.convertPublisherEntityToDto(publisherEntity);
    }

    private void savePublisher(final PublisherDto publisherDto) {
        PublisherEntity publisherResults = convertPublisherDtoToEntity(publisherDto);

        try {
            publisherRepository.saveAndFlush(publisherResults);
        } catch (Exception e) {
            System.out.println("error in publisher service impl");
        }
    }
}
