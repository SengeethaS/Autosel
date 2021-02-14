import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
public static void main(String[] args) throws IOException {
	File f= new File("E:\\Class\\DataExcel.xlsx");
	FileInputStream fin= new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fin);
	Sheet sh=wb.getSheet("sheet1");
	int noOfrows=sh.getPhysicalNumberOfRows();
	System.out.println("Number of rows," +noOfrows);
	for(int i=1;i<=sh.getPhysicalNumberOfRows();i++);
	{
		int i = 1;
		Row r= sh.getRow(i);
		System.out.println("Table contents" +r);
	}
		
		
			
}
}
