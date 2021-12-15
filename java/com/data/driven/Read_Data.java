package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void read_Particular_Data() throws IOException {
		
		File f = new File("E:\\My Files\\User_Data.xlsx");
		
		FileInputStream  fis= new FileInputStream(f);
		
		Workbook wb= new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType celltype= cell.getCellType();
		
		System.out.println("Particular_Data Is :  ");
		
		if (celltype.equals(CellType.STRING)) {
			
			String value= cell.getStringCellValue();
			
			System.out.println(value);
		}
		
		else if (celltype.equals(CellType.NUMERIC)) {
			
			double cellvalue =cell.getNumericCellValue();
			
			int value=(int) cellvalue;
			
			System.out.println(value);
	
		}		
		
		System.out.println("****************");
	}
		
		public static void all_Data() throws Throwable {

			File f = new File("E:\\My Files\\User_Data.xlsx");
			
			FileInputStream  fis= new FileInputStream(f);
			
			Workbook wb= new XSSFWorkbook(fis);
			
			Sheet sheetAt =  wb.getSheetAt(0);
	
			int numberofRows = sheetAt.getPhysicalNumberOfRows();
			
			System.out.println("All_Data :  ");
			
			for (int i = 0; i < numberofRows; i++) {
				
				Row row = sheetAt.getRow(i);
				
				int numberofCells = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < numberofCells; j++) {
					
					Cell cell = row.getCell(j);
					
					CellType celltype = cell.getCellType();
					
					if (celltype.equals(CellType.STRING)) {
						
						String cellvalue = cell.getStringCellValue();
						
						System.out.println(cellvalue);
						
					}
					
					else if (celltype.equals(CellType.NUMERIC)) {
						
						double cellvalue= cell.getNumericCellValue();
						
						int value= (int)cellvalue;
						
						System.out.println(value);
						
					}
					
				}
			}
			
			System.out.println("****************");
			
		}

			public static void particular_Row_Data() throws IOException {
		
				File f = new File("E:\\My Files\\User_Data.xlsx");
				
				FileInputStream  fis= new FileInputStream(f);
				
				Workbook wb= new XSSFWorkbook(fis);
				
				Sheet sheetAt =  wb.getSheetAt(0);
				
				System.out.println("Particular_Row_Data is :  ");
					
					Row row = sheetAt.getRow(3);
						
						int numberofCells = row.getPhysicalNumberOfCells();

						for (int j = 0; j <numberofCells; j++) {
							
							Cell cell = row.getCell(j);
							
							System.out.println(cell);
			
			}
						System.out.println("****************");
				
			}

			
			
		public static void particular_Column_Data() throws Throwable {

			File f = new File("E:\\My Files\\User_Data.xlsx");
			
			FileInputStream  fis= new FileInputStream(f);
			
			Workbook wb= new XSSFWorkbook(fis);
			
			Sheet sheetAt =  wb.getSheetAt(0);
	
			int numberofRows = sheetAt.getPhysicalNumberOfRows();
			
			System.out.println("Particular_Column_Data is :  ");
			
			for (int i = 0; i < numberofRows; i++) {
				
				Row row = sheetAt.getRow(i);
					
					Cell cell = row.getCell(1);
					
					CellType celltype = cell.getCellType();
					
					if (celltype.equals(CellType.STRING)) {
						
						String cellvalue = cell.getStringCellValue();
						
						System.out.println(cellvalue);						
					}
					
					else if (celltype.equals(CellType.NUMERIC)) {
						
						double cellvalue= cell.getNumericCellValue();
						
						int value= (int)cellvalue;
						
						System.out.println(value);
						
					}
					
				}		
			}	

	public static void main(String[] args) throws Throwable {
		
		read_Particular_Data();
		
		all_Data();
		
		particular_Row_Data();
		
		particular_Column_Data();
	}	
} 

