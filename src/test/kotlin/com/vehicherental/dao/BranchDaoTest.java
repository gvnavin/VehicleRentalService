package com.vehicherental.dao;

import com.vehicherental.db.DB;
import com.vehicherental.dbmodels.Branch;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class BranchDaoTest {
    @Mock
    DB db;
    @InjectMocks
    BranchDao branchDao;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() {
        branchDao.save(new Branch("branchName"));
    }

    @Test
    public void testGetByField() {
        Branch result = branchDao.getByField("key", "value");
        Assert.assertEquals(result, new Branch("branchName"));
    }
}


