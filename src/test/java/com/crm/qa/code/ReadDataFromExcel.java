package com.crm.qa.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//How to read data from single cell
		//first i need to create file instance and pass the path of file
		
		File file = new File("D:\\Latest Code\\AllSeleniumCode\\ExcelFiles//Test3.xlsx");
		
		//I'm going to read data so further i will use FileInputStream so it will read data this entire sheet in the form of bytes
		FileInputStream fis = new FileInputStream(file);// Raw data inside fileinputstream
		//then go to workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//then sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		//then row and cell
		String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue); 
		
		workbook.close();
		fis.close();

	}

}
