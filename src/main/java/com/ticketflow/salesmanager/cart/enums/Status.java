package com.ticketflow.salesmanager.cart.enums;

import lombok.Getter;

@Getter
public enum Status {
    CREATED("created"),
    AWAITING_PAYMENT("waiting_payment"),
    FINISHED("finished");

    private final String value;

    Status(String value) {
        this.value = value;
    }
}