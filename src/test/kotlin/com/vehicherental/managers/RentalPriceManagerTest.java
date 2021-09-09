package com.vehicherental.managers;

import com.vehicherental.dao.RentalPriceDao;
import com.vehicherental.db.InMemoryDB;
import com.vehicherental.dbmodels.VehicleType;
import org.testng.annotations.Test;

public class RentalPriceManagerTest {
    //Field rentalPriceDao of type RentalPriceDao - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    RentalPriceManager rentalPriceManager = new RentalPriceManager(new RentalPriceDao(new InMemoryDB()));

    @Test
    public void testAllocatePrice() {
        rentalPriceManager.allocatePrice("branchName", VehicleType.Sedan, 0);
    }
}


