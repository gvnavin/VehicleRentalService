package com.vehicherental.dao;

import com.vehicherental.db.DB;
import com.vehicherental.dbmodels.Booking;
import com.vehicherental.dbmodels.VehicleType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.mockito.Mockito.*;

public class BookingDaoTest {
    @Mock
    DB db;
    @InjectMocks
    BookingDao bookingDao;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        bookingDao.save(new Booking("bookingId", VehicleType.Sedan, LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 4, 23), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 4, 23)));
    }

    @Test
    public void testGetByField() {
        Booking result = bookingDao.getByField("key", "value");
        Assert.assertEquals(result, new Booking("bookingId", VehicleType.Sedan, LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 4, 23), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 4, 23)));
    }
}


