package com.vehicherental.dbmodels;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BranchTest {
    Branch branch = new Branch("branchName");

    @Test
    public void testCopy() {
        Branch result = branch.copy("branchName");
        Assert.assertEquals(result, new Branch("branchName"));
    }

    @Test
    public void testToString() {
        String result = branch.toString();
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }

    @Test
    public void testHashCode() {
        int result = branch.hashCode();
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testEquals() {
        boolean result = branch.equals("other");
        Assert.assertEquals(result, true);
    }
}


