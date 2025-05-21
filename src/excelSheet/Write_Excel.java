package excelSheet;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class Write_Excel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		Object empdata[][]= {   {"EmpId","Name","Job"},
								{101,"Arjun","Actor"},
								{102,"Dhoni","Cricketer"},
								{103,"Pradeep","Anchor"}
							};
		int rows = empdata.length;
		int cols = empdata[0].length;		
		System.out.println("Rows :"+rows);
		System.out.println("Columns :"+cols);		
		for(int r=0;r<rows;r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];			
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filePath=".\\dataFiles\\employee.xlsx";
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream) ;
		outputStream.close();		
		System.out.println("employee.xlsx file written successfully...");
	}
}