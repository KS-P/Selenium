package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream file=new FileInputStream("C:\\Users\\palet\\OneDrive\\Documents\\mytrades.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file); 
		
		XSSFSheet sheet=workbook.getSheet("trades");
		
		int rowcount=sheet.getLastRowNum(); //returns row count
		int colcount=sheet.getRow(0).getLastCellNum(); //returns column or cell count
		
		for(int i=0;i<rowcount;i++) {
	XSSFRow	currentrow=sheet.getRow(i); //focus on the current row
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
			//read the value from the cell
				
				System.out.print(" " +value);
				
			}
			
			System.out.println();
		}
	}

}
