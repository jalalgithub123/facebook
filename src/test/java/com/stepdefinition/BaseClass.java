package com.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class BaseClass {
	public static WebDriver driver;
	public static String userexcel = null;
	public static String passexcel = null;
	public void sendKeys(WebElement element , String data) {
		element.sendKeys(data);

	}
	
	public static List<HashMap<String, String>> excelData(String row) throws IOException {
		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();

		String  data  ="C:\\Users\\moham\\eclipse-workspace\\SUCCESS\\FaceBookTest\\Data\\FACEBOOK.xlsx";	
		String sheetName = "Data";
		FileInputStream fs = new FileInputStream(data);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			Row HeaderRow = sheet.getRow(0);
			int intRow = Integer.parseInt(row);
			Row currentRow = sheet.getRow(intRow);
			HashMap<String, String> currentHash = new HashMap<String, String>();
			for (int j = 0; j <HeaderRow.getPhysicalNumberOfCells() ; j++) {
				Cell currentCell = currentRow.getCell(j);

				try {
					currentCell.getCellType();
					switch (currentCell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
							currentCell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(),String.valueOf(currentCell.getNumericCellValue()));
							break;
					}
				}
			
				catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
			
			

			mydata.add(currentHash);
			return mydata;
	}

}