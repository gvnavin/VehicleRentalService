package com.vehicherental.dao;

import com.vehicherental.db.DB;
import com.vehicherental.dbmodels.Vehicle;
import com.vehicherental.dbmodels.VehicleType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class VehicleDaoTest {
    @Mock
    DB db;
    @InjectMocks
    VehicleDao vehicleDao;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        vehicleDao.save(new Vehicle("vehicleId", VehicleType.Sedan, "branchName"));
    }

    @Test
    public void testGetByField() {
        Vehicle result = vehicleDao.getByField("key", "value");
        Assert.assertEquals(result, new Vehicle("vehicleId", VehicleType.Sedan, "branchName"));
    }
}


