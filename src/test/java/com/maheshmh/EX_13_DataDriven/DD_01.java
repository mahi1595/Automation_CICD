package com.maheshmh.EX_13_DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DD_01 {
   // @Test(dataProvider = "login") // linking the data provider method
    @Test (dataProvider = "getData")
    public void dd01(String username, String password) {
        System.out.println(username + "|" + password);
    }


   // @DataProvider (name = "login" , parallel = true) // creating data provider method
    @DataProvider
    // using below method we can provide multiple set of data to test method which can be used for data driven testing
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@admin.com", "pwd123"},
                new Object[]{"admin@admin.com", "pwd123"}

        };

    }
}
