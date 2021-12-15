package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void Write_Data_Driven() throws Throwable {
	
	File f = new File("C:\\Users\\Admin\\Desktop\\My_Data.xlsx");

	FileInputStream  fis= new FileInputStream(f);

	Workbook wb= new XSSFWorkbook(fis);
	
	
	wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Name");
	
	wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
	
	wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Kavin");
	
	wb.getSheet("Data").getRow(1).createCell(1).setCellValue("KAvin@123");
	
	wb.getSheet("Data").createRow(2).createCell(0).setCellValue("User ID");
	
	wb.getSheet("Data").getRow(2).createCell(1).setCellValue(20);
	
	FileOutputStream  fos= new FileOutputStream(f);
	
	wb.write(fos);
	
	wb.close();
	
	System.out.println("Write Successfully");
	
	
	
  }
	
	public static void main(String[] args) throws Throwable {
		
		Write_Data_Driven();
	}

}