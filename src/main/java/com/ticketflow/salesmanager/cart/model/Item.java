package com.ticketflow.salesmanager.cart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String id;

    private String ticketId;

    private int quantity;

    private Float unitPrice;

    private Float totalPrice;
}
