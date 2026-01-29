package com.Katalondemocure.lib;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelDataReadTest {

    public static void main(String[] args) throws IOException {
        // Specify the path of the Excel file
        String filePath = "./testdata/data2.xlsx";

        // Create an input stream for the Excel file
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));

        // Create a workbook instance
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the first sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0);

        // Loop through each row in the sheet
        for (Row row : sheet) {
            // Loop through each cell in the row
            for (Cell cell : row) {
                // Switch based on the cell's type
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("Unknown Type\t");
                        break;
                }
            }
            System.out.println(); // New line after each row
        }

        // Close the workbook and input stream
        workbook.close();
        fileInputStream.close();
    }
}
