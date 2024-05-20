package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    String testData_dir = "./src/test/java/TestData/testData.xlsx";
    FileInputStream fis = new FileInputStream(testData_dir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    XSSFSheet CustomerInfoSheet = workbook.getSheet("Customer Info");


    public  String FirstName = CustomerInfoSheet.getRow(1).getCell(0).getStringCellValue();
    public String LastName = CustomerInfoSheet.getRow(1).getCell(1).getStringCellValue();

    public String UserName = CustomerInfoSheet.getRow(1).getCell(2).getStringCellValue();
    public String Password = CustomerInfoSheet.getRow(1).getCell(3).getStringCellValue();
    public String Customer = CustomerInfoSheet.getRow(1).getCell(4).getStringCellValue();
    public String Role = CustomerInfoSheet.getRow(1).getCell(5).getStringCellValue();
    public String Email = CustomerInfoSheet.getRow(1).getCell(6).getStringCellValue();
    public String Cell = CustomerInfoSheet.getRow(1).getCell(7).getStringCellValue();

    public ReadFromExcel() throws IOException {
    }
}
