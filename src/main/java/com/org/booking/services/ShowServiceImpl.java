package com.org.booking.services;

import com.org.booking.logger.Logger;
import com.org.booking.models.ScreenShow;

import java.util.ArrayList;
import java.util.List;

public class ShowServiceImpl implements ShowService {
    private final Logger logger;
    private final List<ScreenShow> screenShowList;

    public ShowServiceImpl(Logger logger) {
        this.screenShowList = new ArrayList<>();
        this.logger = logger;
    }

    @Override
    public ScreenShow createScreenShow(ScreenShow screenShow) {
        this.screenShowList.add(screenShow);
        logger.log("Screen show created !!! " + screenShow);
        return screenShow;
    }


}
