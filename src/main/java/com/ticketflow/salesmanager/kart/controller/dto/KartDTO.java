package com.ticketflow.salesmanager.kart.controller.dto;

import com.ticketflow.salesmanager.kart.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KartDTO {

    private Long id;

    private Long userId;

    private Status status = Status.CREATED;

    private String couponId;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    private Float totalPrice;
}
