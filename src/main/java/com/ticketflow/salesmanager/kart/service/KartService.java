package com.ticketflow.salesmanager.kart.service;

import com.ticketflow.salesmanager.kart.controller.dto.KartDTO;
import com.ticketflow.salesmanager.kart.enums.Status;
import com.ticketflow.salesmanager.kart.model.Kart;
import com.ticketflow.salesmanager.kart.repository.KartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class KartService {

    private final SendMessageService rabbitMQSender;

    private final KartRepository kartRepository;

    @Qualifier("modelMapperConfig")
    private final ModelMapper modelMapper;

    public KartService(SendMessageService rabbitMQSender, KartRepository kartRepository, ModelMapper modelMapper) {
        this.rabbitMQSender = rabbitMQSender;
        this.kartRepository = kartRepository;
        this.modelMapper = modelMapper;
    }

    public KartDTO checkout(KartDTO kartDTO) {
        // TODO: Implementar lógica correta de status
        kartDTO.setStatus(Status.FINISHED); // temporário

        Kart kartToSave = modelMapper.map(kartDTO, Kart.class);
        Kart kartSaved = kartRepository.save(kartToSave);
        KartDTO kartDTOSaved = modelMapper.map(kartSaved, KartDTO.class);

        rabbitMQSender.send(kartDTOSaved);
        return kartDTOSaved;
    }

}
