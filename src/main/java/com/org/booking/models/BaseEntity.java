package com.org.booking.models;

import lombok.ToString;

import java.util.UUID;
@ToString
public class BaseEntity {
    private String id;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
