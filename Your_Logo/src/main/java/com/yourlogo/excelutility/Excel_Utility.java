package com.yourlogo.excelutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility 
{
	String fname;
	String lname;
	String password;
	String Address;


	//To get the Mailid from Excel Sheet
	public  String mailid() throws IOException
	{
		FileInputStream file=new FileInputStream("src\\test\\resources\\Test Data\\Create Account Test Data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Registration");
		XSSFRow row=sheet.getRow(1);
		XSSFCell c1=row.getCell(0);
		String mailid =c1.getStringCellValue();	
		return mailid;
	}

	//To get First name,Last name,password,address,city from Excel Sheet
	public  String personalinfo(int j) throws IOException
	{
		FileInputStream file=new FileInputStream("src\\test\\resources\\Test Data\\Create Account Test Data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Registration");
		XSSFRow row=sheet.getRow(1);
		XSSFCell c1=row.getCell(j);
		String info =c1.getStringCellValue();	
		return info;
	}

	//To get Postal Code and Mobile number from Excel Sheet
	public String number(int n) throws IOException
	{
		FileInputStream file=new FileInputStream("src\\test\\resources\\Test Data\\Create Account Test Data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Registration");
		XSSFRow row=sheet.getRow(1);
		XSSFCell c1=row.getCell(n);
		int in=(int) c1.getNumericCellValue();
		String info=Integer.toString(in);
		return info;
	}
}
