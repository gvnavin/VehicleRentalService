package com.vehicherental.dbmodels;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleTest {
    //Field vehicleType of type VehicleType - was not mocked since Mockito doesn't mock enums
    Vehicle vehicle = new Vehicle("vehicleId", VehicleType.Sedan, "branchName");

    @Test
    public void testCopy() {
        Vehicle result = vehicle.copy("vehicleId", VehicleType.Sedan, "branchName");
        Assert.assertEquals(result, new Vehicle("vehicleId", VehicleType.Sedan, "branchName"));
    }

    @Test
    public void testToString() {
        String result = vehicle.toString();
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }

    @Test
    public void testHashCode() {
        int result = vehicle.hashCode();
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testEquals() {
        boolean result = vehicle.equals("other");
        Assert.assertEquals(result, true);
    }
}


