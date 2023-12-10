package com.org.booking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.BitSet;
@Data
@ToString(callSuper = true)
@AllArgsConstructor
public class Screen extends BaseEntity {
    private String screenNumber;
}
