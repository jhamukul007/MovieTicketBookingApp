package com.org.booking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class TheaterScreen extends BaseEntity{
    private Theater theater;
    private Screen screen;
}
