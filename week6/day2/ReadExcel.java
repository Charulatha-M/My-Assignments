package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	//open my excel
    //Set the path for workbook (file path)
    XSSFWorkbook wb =new XSSFWorkbook("Data/CreateLead.xlsx");
    //go into sheet based on sheet name
    //XSSFSheet sheet = wb.getSheet("Sheet1");  //input string name
    //Get into the sheet based on index
    XSSFSheet ws = wb.getSheetAt(0);
    //To get the row count
    int rowCount = ws.getLastRowNum();

    //Get Row
    for (int i = 1; i <=rowCount; i++) {
        XSSFRow row = ws.getRow(i);
    //To get the columnCount
        short columnCount = row.getLastCellNum();
        
    //Get my Column
    for(int j=0;j<columnCount;j++) {
   XSSFCell cell = row.getCell(j);
   //print the particular value
   String cellvalue = cell.getStringCellValue();
   System.out.println(cellvalue);
   //close the workbook
   wb.close();
    }
}

}
}
