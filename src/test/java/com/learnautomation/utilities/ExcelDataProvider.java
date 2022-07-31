package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;

	public ExcelDataProvider() {
		
		File src = new File("\\Users\\apple\\eclipse-workspace\\Framework\\TestData\\UserData.xlxs");
		
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getPath());
		try {
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excel file is failed to launch " + e.getMessage());
			e.printStackTrace();
		} 
	}
	
	
	public String getStringData(String sheetName, int row, int col) {
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
//	public String getStringData(int sheetIndex, int row, int col) {
//		return wb.getSheetName(sheetIndex).getRow(row).getCell(col).getStringCellValue();
//	}
	
	public double getNumericData(String sheetName, int row, int col) {
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
		
	}
	
}
