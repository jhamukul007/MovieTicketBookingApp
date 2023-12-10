package com.org.booking.models;

import com.org.booking.enums.Status;
import lombok.Data;

@Data
public class ShowSeat extends BaseEntity {
    private Show show;
    private Seat seat;
    private Status showSeatStatus;
}
