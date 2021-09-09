package com.vehicherental.managers;

import com.vehicherental.dao.VehicleDao;
import com.vehicherental.db.InMemoryDB;
import com.vehicherental.dbmodels.VehicleType;
import org.testng.annotations.Test;

public class VehicleManagerTest {
    //Field vehicleDao of type VehicleDao - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    VehicleManager vehicleManager = new VehicleManager(new VehicleDao(new InMemoryDB()));

    @Test
    public void testAddVehicle() {
        vehicleManager.addVehicle("vehicleId", VehicleType.Sedan, "branchName");
    }
}


