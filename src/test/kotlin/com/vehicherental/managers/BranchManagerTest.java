package com.vehicherental.managers;

import com.vehicherental.dao.BranchDao;
import com.vehicherental.db.InMemoryDB;
import org.testng.annotations.Test;

public class BranchManagerTest {
    //Field branchDao of type BranchDao - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    BranchManager branchManager = new BranchManager(new BranchDao(new InMemoryDB()));

    @Test
    public void testAddBranch() {
        branchManager.addBranch("branchName");
    }
}


