package com.ticketflow.salesmanager.kart.controller;

import com.ticketflow.salesmanager.kart.controller.dto.KartDTO;
import com.ticketflow.salesmanager.kart.service.KartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kart")
public class KartController {

    private final KartService kartService;

    public KartController(KartService kartService) {
        this.kartService = kartService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<KartDTO> checkout(@RequestBody KartDTO kartDTO) throws Exception {
        KartDTO savedKartDTO = kartService.checkout(kartDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedKartDTO);
    }
}