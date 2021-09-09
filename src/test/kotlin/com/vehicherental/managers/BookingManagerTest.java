package com.vehicherental.managers;

import com.vehicherental.dao.BookingDao;
import com.vehicherental.db.InMemoryDB;
import com.vehicherental.dbmodels.VehicleType;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class BookingManagerTest {
    //Field bookingDao of type BookingDao - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    BookingManager bookingManager;

    {
        final InMemoryDB db = new InMemoryDB();
        bookingManager = new BookingManager(new BookingDao(db));
    }

    @Test
    public void testBookVehicle() {
        bookingManager.bookVehicle(VehicleType.Sedan,
                LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 51), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 51));

    }
}


