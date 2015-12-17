package com.ust.datadriven.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
/*
 * this will only talk to the Excel
 */
public class ExcelReader {
	public static void main(String[] args) throws IOException {
		ExcelReader obj = new ExcelReader();
		obj.readExcel();
	}
	
	public void readExcel() throws IOException{
		// Read the File From the Specified Location
		//ConfigReader reader = new ConfigReader();
		String path = ConfigReader.getXLSPath();
		//String path = reader.getXLSPath();
		// read the File
		FileInputStream fi = new FileInputStream(path);
		// read workbook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// read sheet
		HSSFSheet sheet = workBook.getSheetAt(0);
		// read rows
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			// read the current row
			Row currentRow = rows.next();
			// Inside the current row , reading the cells
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
				System.out.print(currentCell.getStringCellValue()+"  ");
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					System.out.println(currentCell.getNumericCellValue());
				}
			} // Cell Loop ends
			System.out.println();
		} // Row Loop Ends
	workBook.close();
	fi.close();
	}

}
