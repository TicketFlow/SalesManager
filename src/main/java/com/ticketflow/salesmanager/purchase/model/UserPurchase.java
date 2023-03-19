package com.ticketflow.salesmanager.purchase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "user_purchases")
public class UserPurchase {

    @Id
    private String id;

    private String saleId;

    private String eventId;

    private LocalDateTime eventDate;

    private List<String> tickets;

    private Float totalPrice;

    private LocalDateTime purchaseDate;
}