package com.qa.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utility {		
		public static FileInputStream fileLoc;
		public static XSSFWorkbook wBook;
		public static XSSFSheet wSheet;
		public static XSSFRow row;
		public static XSSFCell cell;
		
		
		public static int getrowcount(String xFile, String xSheet) throws IOException
		{

			fileLoc = new FileInputStream(xFile);
			wBook= new XSSFWorkbook(fileLoc);
			wSheet = wBook.getSheet(xSheet);
			int rowcount = wSheet.getLastRowNum();		
			return rowcount ;
		}
		
		public static int getcellcount(String xFile, String xSheet,int rownum) throws IOException
		{
			fileLoc = new FileInputStream(xFile);
			wBook= new XSSFWorkbook(fileLoc);
			wSheet = wBook.getSheet(xSheet);
			row = wSheet.getRow(rownum);
			int cellcount = row.getLastCellNum();	
			return cellcount;
		}
		public static String getcelldata(String xFile,String xSheet,int rownum,int colnum) throws IOException
		{
			fileLoc = new FileInputStream(xFile);
			wBook= new XSSFWorkbook(fileLoc);
			wSheet = wBook.getSheet(xSheet);
			row = wSheet.getRow(rownum);
			cell = row.getCell(colnum);
			
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			
			wBook.close();
			fileLoc.close();
					
			return cellData;
		}

	}



