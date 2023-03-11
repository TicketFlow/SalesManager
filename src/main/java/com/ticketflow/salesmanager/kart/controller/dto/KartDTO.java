package com.ticketflow.salesmanager.kart.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ticketflow.salesmanager.kart.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime createdAt = LocalDateTime.now();


    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime updatedAt = LocalDateTime.now();

    private Float totalPrice;
}
