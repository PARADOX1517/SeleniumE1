package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

       public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
       {
    	  FileInputStream fis = new  FileInputStream(excelPath);//TO provide the path of the excel
		  Workbook wb = WorkbookFactory.create(fis);//to make the file ready to  read 
		  Sheet sheet = wb.getSheet(sheetName);//To get the Desired Sheet
		  Row row = sheet.getRow(rowNo);//To get into the desired row
		  Cell cell = row.getCell(cellNo);//To get into desired cell
		  String data = cell.getStringCellValue();//To read data from the cell
		  return data;  
       }
  //------------------------------------------------------------------------------------------------------------------------------------------------------
         
 //This method  is use to get no.of rows from the particular sheet
       
       public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
       {
        FileInputStream fis = new FileInputStream(excelPath);//TO provide the path of the excel
   		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to  read
   		Sheet sheet = wb.getSheet(sheetName);//To get the Desired Sheet
   		int rc = sheet.getLastRowNum();//To get the no. of rows from the sheet
   		return rc;
     
       }
       
  //-----------------------------------------------------------------------------------
 
       
       public void writeExcelData(String excelPath,String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException
       {
    	  FileInputStream fis = new FileInputStream(excelPath);//TO provide the path of the excel
    	  Workbook wb = WorkbookFactory.create(fis);//to make the file ready to  read
    	  Sheet sheet = wb.getSheet(sheetName);//To get into Desired Sheet
    	  Row row = sheet.getRow(rowNo);//To get into the desired row
    	  Cell cell = row.getCell(cellNo);//To get into desired cell
    	  cell.setCellValue(data);// To pass The String Data to the desired cell
    	  
    	  FileOutputStream fos = new FileOutputStream(excelPath);
    	  wb.write(fos);
    	  
    	  
       }
}
