package com.ticketflow.salesmanager.cart.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    private String id;

    private String ticketId;

    private int quantity;

    private Float unitPrice;

    private Float totalPrice;
}
