package com.Katalondemocure.lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
	

	public String ReadCellData(int vRow, int vColumn) throws IOException  
	{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
 
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("C:/Users/harshitha.n8/eclipse-workspace/ExcelRead_POI/srcdata/data1.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new XSSFWorkbook(fis);  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}  
	
	public String ReadCellData1(int vRow, int vColumn) throws IOException  
	{  
	String value1=null;          //variable for storing the cell value  
	Workbook wb1=null;           //initialize Workbook null  
 
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("./Data1/SampleTestcase_Mpetzone1.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb1=new XSSFWorkbook(fis);   
	Sheet sheet=wb1.getSheetAt(1);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value1=cell.getStringCellValue();    //getting cell value  
	
	//cell.getNumericCellValue();
	//cell.getDateCellValue();
	return value1;               //returns the cell value  
	}  	
}
