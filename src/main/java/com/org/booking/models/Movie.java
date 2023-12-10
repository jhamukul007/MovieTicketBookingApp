package com.org.booking.models;

import lombok.Data;

@Data
public class Movie extends BaseEntity {
    private String name;
    private Long runningDuration;
}
