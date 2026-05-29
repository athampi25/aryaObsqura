package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	 static FileInputStream f; //used to  read the excel file from system
	 static XSSFWorkbook w; //used to represent the entire excel workbook
	 static XSSFSheet sh; //represent one sheet inside the workbook

	 public static String readStringData(int row, int col) throws IOException {
		 //open the excel file from given location
	  f = new FileInputStream("N:\\Arya\\aryaObsqura\\mavenproject\\src\\main\\resources\\Excel.xlsx");
	  w = new XSSFWorkbook(f); // load the excel file into memory using apache poi(java library)
	  sh = w.getSheet("Sheet1"); // to select sheet named Sheet1 from excel workbook
	  XSSFRow r = sh.getRow(row); // get the row based on the row number
	  XSSFCell c = r.getCell(col); // get the cell in that row based on column number
	  return c.getStringCellValue(); // returns the text or String from the cell

	 }

	 public static String readIntegerData(int row, int col) throws IOException {
	  f = new FileInputStream("N:\\Arya\\aryaObsqura\\mavenproject\\src\\main\\resources\\Excel.xlsx");
	  w = new XSSFWorkbook(f);
	  sh = w.getSheet("Sheet1");
	  XSSFRow r = sh.getRow(row);
	  XSSFCell c = r.getCell(col);
	  int val = (int) c.getNumericCellValue(); //convert double to int using typecasting
	  return String.valueOf(val); //convert int to string using valueOf() method
	  
		
	 }

	}