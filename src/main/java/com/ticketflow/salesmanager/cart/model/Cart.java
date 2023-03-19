package com.ticketflow.salesmanager.cart.model;

import com.ticketflow.salesmanager.cart.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "carts")
public class Cart {

    @Id
    private String id;

    private List<Item> items;

    private String coupon;

    private String userId;

    private Float totalPrice;

    private Status status;
}
