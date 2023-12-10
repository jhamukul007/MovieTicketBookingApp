package com.org.booking.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString(callSuper = true)
public class Theater extends BaseEntity {
    private String name;
    private String city;
    private String locality;
}
