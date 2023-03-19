package com.ticketflow.salesmanager.cart.service;

import com.ticketflow.salesmanager.cart.controller.dto.CartDTO;
import com.ticketflow.salesmanager.cart.enums.Status;
import com.ticketflow.salesmanager.cart.model.Cart;
import com.ticketflow.salesmanager.cart.repository.CartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final SendMessageService rabbitMQSender;

    private final CartRepository cartRepository;

    @Qualifier("modelMapperConfig")
    private final ModelMapper modelMapper;

    public CartService(SendMessageService rabbitMQSender, CartRepository cartRepository, ModelMapper modelMapper) {
        this.rabbitMQSender = rabbitMQSender;
        this.cartRepository = cartRepository;
        this.modelMapper = modelMapper;
    }

    public CartDTO checkout(CartDTO cartDTO) {
        // TODO: Implementar lógica correta de status
        cartDTO.setStatus(Status.FINISHED); // temporário

        Cart kartToSave = modelMapper.map(cartDTO, Cart.class);
        Cart kartSaved = cartRepository.save(kartToSave);
        CartDTO cartDTOSaved = modelMapper.map(kartSaved, CartDTO.class);

        rabbitMQSender.send(cartDTOSaved);
        return cartDTOSaved;
    }

    public List<Cart> getAll() {
        return cartRepository.findAll();
    }


}
