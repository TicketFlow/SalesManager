package com.ticketflow.salesmanager.cart.controller.dto;

import com.ticketflow.salesmanager.cart.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private String id;

    private List<ItemDTO> items;

    private String coupon;

    private String userId;

    private Float totalPrice;

    private Status status;
}
