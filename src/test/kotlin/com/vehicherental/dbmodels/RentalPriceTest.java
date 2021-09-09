package com.vehicherental.dbmodels;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RentalPriceTest {
    //Field vehicleType of type VehicleType - was not mocked since Mockito doesn't mock enums
    RentalPrice rentalPrice = new RentalPrice("branchName", VehicleType.Sedan, 0);

    @Test
    public void testCopy() {
        RentalPrice result = rentalPrice.copy("branchName", VehicleType.Sedan, 0);
        Assert.assertEquals(result, new RentalPrice("branchName", VehicleType.Sedan, 0));
    }

    @Test
    public void testToString() {
        String result = rentalPrice.toString();
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }

    @Test
    public void testHashCode() {
        int result = rentalPrice.hashCode();
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testEquals() {
        boolean result = rentalPrice.equals("other");
        Assert.assertEquals(result, true);
    }
}


