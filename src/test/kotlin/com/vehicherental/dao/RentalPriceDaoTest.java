package com.vehicherental.dao;

import com.vehicherental.db.DB;
import com.vehicherental.dbmodels.RentalPrice;
import com.vehicherental.dbmodels.VehicleType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class RentalPriceDaoTest {
    @Mock
    DB db;
    @InjectMocks
    RentalPriceDao rentalPriceDao;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        rentalPriceDao.save(new RentalPrice("branchName", VehicleType.Sedan, 0));
    }

    @Test
    public void testGetByField() {
        RentalPrice result = rentalPriceDao.getByField("key", "value");
        Assert.assertEquals(result, new RentalPrice("branchName", VehicleType.Sedan, 0));
    }
}


