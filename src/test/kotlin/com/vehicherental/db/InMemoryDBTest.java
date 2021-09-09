package com.vehicherental.db;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.mockito.Mockito.*;

public class InMemoryDBTest {
    @Mock
    HashSet<Object> vehicleTable;
    @Mock
    HashSet<Object> branchTable;
    @Mock
    HashSet<Object> priceTable;
    @Mock
    HashSet<Object> bookingTable;
    @Mock
    HashMap<TableName, HashSet<Object>> tableMap;
    @InjectMocks
    InMemoryDB inMemoryDB;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        inMemoryDB.save(TableName.Booking, "e");
    }
}


