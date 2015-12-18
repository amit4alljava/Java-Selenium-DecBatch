package com.ust.datadriven.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import static com.ust.datadriven.utility.ConfigReader.*;
/*
 * this will only talk to the Excel
 */
public class ExcelReader {
	public static void main(String[] args) throws IOException {
		ExcelReader obj = new ExcelReader();
		obj.readExcel();
	}
	
	public Object[][] readExcel() throws IOException{
		Object[][] array = new Object[getRow()][getColumn()];
		int row = 0;
		boolean isFirstRowPassed=false;
		
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
		// Traverse the Rows
		while(rows.hasNext()){
			// read the current row
			Row currentRow = rows.next();
			if(!isFirstRowPassed){
				isFirstRowPassed = true;
				continue;// skip the current loop and it will go next
			}
			// Inside the current row , reading the cells
			Iterator<Cell> cells = currentRow.cellIterator();
			int column  = 0;
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
				array[row][column] = currentCell.getStringCellValue();
					//System.out.print(currentCell.getStringCellValue()+"  ");
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					array[row][column] = currentCell.getNumericCellValue();
					//System.out.println(currentCell.getNumericCellValue());
				}
				column++;
			} // Cell Loop ends
			row++;
			//System.out.println();
		} // Row Loop Ends
	workBook.close();
	fi.close();
	return array;
	}

}
