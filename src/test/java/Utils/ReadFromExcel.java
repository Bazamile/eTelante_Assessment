package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    String TestData_dir="./src/test/java/TestData/TestData.xlsx";
    FileInputStream fis = new FileInputStream(TestData_dir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    XSSFSheet CustomerInfo = workbook.getSheet("CustomerInfo");


    public String FirstName = CustomerInfo.getRow(1).getCell(0).getStringCellValue();
    public String LastName = CustomerInfo.getRow(1).getCell(1).getStringCellValue();

    public String UserName = CustomerInfo.getRow(1).getCell(2).getStringCellValue();
    public String Password = CustomerInfo.getRow(1).getCell(3).getStringCellValue();
    public String Customer = CustomerInfo.getRow(1).getCell(4).getStringCellValue();
    public String Role = CustomerInfo.getRow(1).getCell(5).getStringCellValue();
    public String Email = CustomerInfo.getRow(1).getCell(6).getStringCellValue();
    public String Cell = CustomerInfo.getRow(1).getCell(7).getStringCellValue();


    public ReadFromExcel() throws IOException {
    }
}
