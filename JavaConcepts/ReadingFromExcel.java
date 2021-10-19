package JavaConcepts;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;


public class ReadingFromExcel {


    XSSFWorkbook wb;


    public ReadingFromExcel() {

//        String filePath = System.getProperty("user.dir") + "/ApplicationTestData/AppData.xlsx";
        System.out.println("user directory:" + System.getProperty("user.dir"));
        String filePath = "C:\\Users\\skalra\\IdeaProjects\\CcumberTraining\\cucumbertraining\\CucumberBDD\\ApplicationTestData\\AppData.xlsx";
        System.out.println("Test data file path:" + filePath);
        File src = new File(filePath);

        try {
            FileInputStream fis = new FileInputStream(src);

            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {
            System.out.println("Ëxception is " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        ReadingFromExcel obj = new ReadingFromExcel();
        obj.getData("Sheet1", 2, 1);
        obj.getData(0, 2, 1);
    }


    //sheet index, row and column starts with 0
    public String getData(int sheetIndex, int rowNumber, int columnNumber) {

        Sheet sheet = wb.getSheetAt(sheetIndex);   //getting the XSSFSheet object at given index
        Row row = sheet.getRow(rowNumber); //returns the logical row
        Cell cell = row.getCell(columnNumber); //getting the cell representing the given column
        String value = cell.getStringCellValue();    //getting cell value
//        String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
        System.out.println("Data value from excel is: " + value);

        return value;
    }

    public String getData(String sheetName, int row, int column) {

        String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
        System.out.println("Data value from excel is: " + data);

        return data;
    }


}
