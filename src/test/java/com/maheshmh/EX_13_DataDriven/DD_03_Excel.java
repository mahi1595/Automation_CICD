package com.maheshmh.EX_13_DataDriven;

import com.maheshmh.Util.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DD_03_Excel {


    @Test(dataProvider = "getData")
    public void dd_excel(String username, String password) {

        System.out.println("running dd_excel");
        System.out.println(username + "|" + password);


    }

    @DataProvider
    // using below method we can provide multiple set of data to test method which can be used for data driven testing
    public Object[][] getData() {
        return UtilExcel.getdatafromExcel("Sheet1");

    }

    ;
}

