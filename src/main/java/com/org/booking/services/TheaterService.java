package com.org.booking.services;

import com.org.booking.models.Theater;

import java.util.List;

public interface TheaterService {
    Theater createTheater(Theater theater);
    List<Theater> searchTheaterByCity(String city);
    List<Theater> searchTheaterByCityAndLocality(String city, String locality);
}
