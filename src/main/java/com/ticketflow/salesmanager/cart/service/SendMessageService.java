package com.ticketflow.salesmanager.cart.service;

import com.ticketflow.salesmanager.cart.controller.dto.CartDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SendMessageService {

    private final AmqpTemplate amqpTemplate;

    @Value("${ticket-flow.rabbitmq.exchange}")
    private String exchange;

    @Value("${ticket-flow.rabbitmq.routing-key}")
    private String routingkey;

    public void send(CartDTO cartDTO) {
        amqpTemplate.convertAndSend(exchange, routingkey, cartDTO);
        log.info("Message sent: " + cartDTO);
    }
}