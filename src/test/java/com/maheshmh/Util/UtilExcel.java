package com.maheshmh.Util;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {


    // getting location of the excel file
    public static String SheetPath = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";
    static Workbook book; //  workbook class works as a  bridge between java and excel used to create workbook
    static Sheet sheet; // sheet class is used to access the sheet from the workbook

    public static Object[][] getdatafromExcel(String sheetName) {

        // below steps we need to follow to read data from excel file
        // Apache POI
        // Read the File - TestData.xlsX
        //  Workbook Create
        // Sheet
        // Row and Cell
        // 2D Object  - getData()

        FileInputStream fileInputStream = null; // creating file input stream object to read the file
        try {
            fileInputStream = new FileInputStream(SheetPath); // creating file input stream object to read the file
            book = WorkbookFactory.create(fileInputStream); // creating workbook object using workbook factory
            sheet = book.getSheet(sheetName); // getting the sheet from the workbook using sheet name

        } catch (IOException e) {
            System.out.println("file not found");
        }
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; // creating 2d object array to store the data from excel
        for (int i = 0; i < sheet.getLastRowNum(); i++) { // iterating through the rows
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) { // iterating through the columns
                // first row email,password -> column name - skip - header
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString(); // storing the data from excel to 2d object array
            }

        }

        return data;
    }
}
