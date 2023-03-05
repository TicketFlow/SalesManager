package com.ticketflow.salesmanager.kart.enums;

import lombok.Getter;

@Getter
public enum Status {
    CREATED("created"),
    AWAITING_PAYMENT("awaiting_payment"),
    FINISHED("finished");

    private final String value;

    Status(String value) {
        this.value = value;
    }
}