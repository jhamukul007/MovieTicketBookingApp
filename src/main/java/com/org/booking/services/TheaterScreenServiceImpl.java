package com.org.booking.services;

import com.org.booking.logger.Logger;
import com.org.booking.models.Screen;
import com.org.booking.models.TheaterScreen;

import java.util.ArrayList;
import java.util.List;

public class TheaterScreenServiceImpl implements TheaterScreenService {
    private final List<TheaterScreen> theaterScreens;
    private final List<Screen> Screens;
    private final Logger logger;

    public TheaterScreenServiceImpl(Logger logger) {
        this.theaterScreens = new ArrayList<>();
        this.Screens = new ArrayList<>();
        this.logger = logger;
    }

    @Override
    public Screen createScreen(Screen screen) {
        this.Screens.add(screen);
        logger.log("Screen created !!! " + screen);
        return screen;
    }

    @Override
    public TheaterScreen createTheaterScreen(TheaterScreen theaterScreen) {
        this.theaterScreens.add(theaterScreen);
        logger.log("TheaterScreen created !!! " + theaterScreen);
        return theaterScreen;
    }

}
