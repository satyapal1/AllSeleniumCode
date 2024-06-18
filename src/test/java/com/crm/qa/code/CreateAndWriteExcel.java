package com.crm.qa.code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcel {

	public static void main(String[] args) throws IOException {
		
		//Old Excel File
		
		/*
		 * HSSFWorkbook workbook = new HSSFWorkbook();
		 * 
		 * HSSFSheet sheet = workbook.createSheet("TestSheet");
		 * 
		 * sheet.createRow(0); sheet.getRow(0).createCell(0).setCellValue("satya");
		 * sheet.getRow(0).createCell(1).setCellValue("pal");
		 * 
		 * sheet.createRow(1); sheet.getRow(1).createCell(0).setCellValue("Ravi");
		 * sheet.getRow(1).createCell(1).setCellValue("Sagar");
		 * 
		 * File file = new
		 * File("D:\\Latest Code\\AllSeleniumCode\\ExcelFiles\\Test2.xls");
		 * FileOutputStream fos = new FileOutputStream(file); workbook.write(fos);
		 * //workbook.write(file); workbook.close();
		 */
		
        XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("TestSheet");
		
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("satya");
		sheet.getRow(0).createCell(1).setCellValue("pal");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Ravi");
		sheet.getRow(1).createCell(1).setCellValue("Sagar");
		
		File file = new File("D:\\Latest Code\\AllSeleniumCode\\ExcelFiles\\Test3.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		//workbook.write(file);
		workbook.close();
	}

}
