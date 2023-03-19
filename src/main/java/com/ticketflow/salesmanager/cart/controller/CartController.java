package com.ticketflow.salesmanager.cart.controller;

import com.ticketflow.salesmanager.cart.controller.dto.CartDTO;
import com.ticketflow.salesmanager.cart.model.Cart;
import com.ticketflow.salesmanager.cart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService kartService) {
        this.cartService = kartService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<CartDTO> checkout(@RequestBody CartDTO cartDTO) {
        CartDTO savedCartDTO = cartService.checkout(cartDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCartDTO);
    }

    @GetMapping
    public ResponseEntity<List<Cart>> getAll() {
        List<Cart> all = cartService.getAll();

        return ResponseEntity.status(HttpStatus.OK).body(all);
    }
}
