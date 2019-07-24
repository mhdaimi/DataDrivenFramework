package com.newtours.automate.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.newtours.automate.objectRepo.Repository;

public class Excel {
	
	public static ArrayList<String> getRowData(int rowNumber) throws Exception{
		
		ArrayList<String> list = new ArrayList<>();
		
		File fileObject = new File(Repository.testDataFilePath);
		FileInputStream inputStream = new FileInputStream(fileObject);
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet =  workbook.getSheet("Sheet2");
		
		HSSFRow row = sheet.getRow(rowNumber);
		int maxCell = row.getLastCellNum();
		for(int j = 0; j < maxCell; j++) {
			HSSFCell cell = row.getCell(j);
			//System.out.print(cell.getStringCellValue() + " ");
			list.add(cell.getStringCellValue());
			}
		return list;
	}

}
