package com.ticketflow.salesmanager.cart.repository;

import com.ticketflow.salesmanager.cart.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {
}
