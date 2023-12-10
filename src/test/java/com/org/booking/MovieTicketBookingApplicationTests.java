package com.org.booking;

import com.org.booking.logger.ConsoleLogger;
import com.org.booking.logger.Logger;
import com.org.booking.models.Screen;
import com.org.booking.models.Theater;
import com.org.booking.models.TheaterScreen;
import com.org.booking.services.TheaterScreenService;
import com.org.booking.services.TheaterScreenServiceImpl;
import com.org.booking.services.TheaterService;
import com.org.booking.services.TheaterServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MovieTicketBookingApplicationTests {
    private Logger logger;
    private TheaterService theaterService;

    private TheaterScreenService screenService;

    @BeforeAll
    public void init() {
        this.logger = new ConsoleLogger();
        this.theaterService = new TheaterServiceImpl(logger);
        this.screenService = new TheaterScreenServiceImpl(logger);
    }

    @Test
    public void createTheater() {
        Theater t1 = Theater.builder()
                .name("Lila")
                .city("Bangalore")
                .locality("HSR")
                .build();
        Theater t2 = Theater.builder()
                .name("PVR")
                .city("Bangalore")
                .locality("Sarjapur Road")
                .build();
        Theater t3 = Theater.builder()
                .name("Inox")
                .city("Bangalore")
                .locality("Marathalli")
                .build();
        Theater t4 = Theater.builder()
                .name("Lila")
                .city("Delhi")
                .locality("Mohan Garden")
                .build();

        Theater theater = theaterService.createTheater(t1);
        Theater theater1 =theaterService.createTheater(t2);
        Theater theater2 =theaterService.createTheater(t3);
        Theater theate3 = theaterService.createTheater(t4);

        logger.log(theaterService.searchTheaterByCity("Bangalore"));
        logger.log(theaterService.searchTheaterByCity("Delhi"));
        logger.log(theaterService.searchTheaterByCityAndLocality("Bangalore", "HSR"));
        logger.log(theaterService.searchTheaterByCityAndLocality("Delhi", "Mohan Garden"));

        Screen screen1 = new Screen("1");
        Screen screen2 = new Screen("2");

        screenService.createScreen(screen1);
        screenService.createScreen(screen2);

        TheaterScreen s1 = new TheaterScreen(theater1, screen1);
        TheaterScreen s2 = new TheaterScreen(theater1, screen2);
        TheaterScreen s3 = new TheaterScreen(theater2, screen2);


        screenService.createTheaterScreen(s1);
        screenService.createTheaterScreen(s2);
        screenService.createTheaterScreen(s3);



    }
}
