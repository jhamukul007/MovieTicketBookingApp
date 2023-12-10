package com.org.booking.services;

import com.org.booking.models.Screen;
import com.org.booking.models.TheaterScreen;

public interface TheaterScreenService {
    Screen createScreen(Screen screen);
    TheaterScreen createTheaterScreen(TheaterScreen theaterScreen);
}
