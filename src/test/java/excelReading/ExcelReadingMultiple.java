package excelReading;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;

public class ExcelReadingMultiple {
	@Test
	public void ExcelReading() throws IOException {

		File f1 = new File(System.getProperty("user.dir") + "//TestData//Data.xlsx");

		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Data");
		// Number of rows
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();

		Object arr[][] = new Object[row-1][cell];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				arr[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(arr[i-1][j] + " ");
			}
			System.out.println();
		}

	}
}
