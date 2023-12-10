package com.org.booking.models;

import lombok.Data;

import java.util.Date;

@Data
//also used for lock Seat
public class MovieShow extends BaseEntity {
    private Movie movie;
    private Show show;
    private Date date;
}


