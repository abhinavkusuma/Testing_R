package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class Read_Excel {

    public static void main(String[] args) throws IOException {
        String excelFilePath = ".\\dataFiles\\Countries.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);        
        int rows = sheet.getLastRowNum();       
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            if (row == null) continue;  // Skip null rows
            int cols = row.getLastCellNum();
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                if (cell == null) {
                    System.out.print("NULL\t");
                    continue;
                }
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print("UNKNOWN\t");
                }
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
    }
}