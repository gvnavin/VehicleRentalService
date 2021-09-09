package com.vehicherental.dbmodels;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class BookingTest {
    //Field vehicleType of type VehicleType - was not mocked since Mockito doesn't mock enums
    //Field startTimestamp of type LocalDateTime - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field endTimestamp of type LocalDateTime - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    Booking booking = new Booking("bookingId", VehicleType.Sedan, LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7));

    @Test
    public void testCopy() {
        Booking result = booking.copy("bookingId", VehicleType.Sedan, LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7));
        Assert.assertEquals(result, new Booking("bookingId", VehicleType.Sedan, LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7), LocalDateTime.of(2021, Month.SEPTEMBER, 9, 15, 9, 7)));
    }

    @Test
    public void testToString() {
        String result = booking.toString();
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }

    @Test
    public void testHashCode() {
        int result = booking.hashCode();
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testEquals() {
        boolean result = booking.equals("other");
        Assert.assertEquals(result, true);
    }
}


