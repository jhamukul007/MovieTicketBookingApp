package com.org.booking.models;

import lombok.Data;

import java.util.Date;

@Data
public class Show extends BaseEntity {
    private String startDate;
    private String endDate;
}

