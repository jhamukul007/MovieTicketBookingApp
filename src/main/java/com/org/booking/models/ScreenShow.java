package com.org.booking.models;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(callSuper = true)
public class ScreenShow extends BaseEntity {
    private Screen screen;
    private Show show;
}
