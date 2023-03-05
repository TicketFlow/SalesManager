package com.ticketflow.salesmanager.kart.service;

import com.ticketflow.salesmanager.kart.controller.dto.KartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendMessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${ticket-flow.rabbitmq.exchange}")
    private String exchange;

    @Value("${ticket-flow.rabbitmq.routing-key}")
    private String routingkey;

    public void send(KartDTO kartDTO) {
        amqpTemplate.convertAndSend(exchange, routingkey, kartDTO);
        log.info("Message sent: " + kartDTO);
    }
}