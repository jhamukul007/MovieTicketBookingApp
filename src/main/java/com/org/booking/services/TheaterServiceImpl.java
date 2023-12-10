package com.org.booking.services;

import com.org.booking.logger.Logger;
import com.org.booking.models.Theater;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TheaterServiceImpl implements TheaterService {
    private final List<Theater> theaters;
    private final Logger logger;

    public TheaterServiceImpl(Logger logger) {
        this.theaters = new ArrayList<>();
        this.logger = logger;
    }

    @Override
    public Theater createTheater(Theater theater) {
        this.theaters.add(theater);
        logger.log("Theater created !!! " + theater);
        return theater;
    }

    @Override
    public List<Theater> searchTheaterByCity(String city) {
        return theaters.stream().filter(theater -> Objects.deepEquals(theater.getCity(), city)).collect(Collectors.toList());
    }

    @Override
    public List<Theater> searchTheaterByCityAndLocality(String city, String locality) {
        return theaters.stream().filter(theater -> Objects.deepEquals(theater.getCity(), city) && Objects.deepEquals(theater.getLocality(), locality)).collect(Collectors.toList());
    }
}
