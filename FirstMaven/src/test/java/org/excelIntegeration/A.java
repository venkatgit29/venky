package org.excelIntegeration;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
public static String getdata(int rowNo,int cellNo) throws Throwable {
	String v = null;
	File loc = new File ("C:\\Users\\dell\\eclipse-workspace\\FirstMaven\\xl\\venkat xl.xlsx");
	FileInputStream Stream = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(Stream);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int type = c.getCellType();
	if(type==1);{
	v=c.getStringCellValue();
	}
	else if(type==0){
		if(DateUtil.isCellDateFormatted(c)){
		Date datecellvalue = c.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yy");
		v=sim.format(datecellvalue);
		}
	else {
		doubleNumericCellValue = c.getNumericCellValue();
		long l = (long) NumericCellValue;
		v= String.valueOf(1);
	}
}
return v;
}
