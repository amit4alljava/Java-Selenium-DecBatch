package com.ust.keyworddriven.utility;


import static com.ust.keyworddriven.utility.ConfigReader.getXLSPath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


import com.ust.keyworddriven.dto.CommandDTO;

public class ExcelReader {
	
	public Object[][] readExcelData() throws IOException{
		Object[][] array = new Object[3][2];
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

	
	public ArrayList<CommandDTO> readExcel() throws IOException{
		CommandDTO commandDTO = null;
		ArrayList<CommandDTO> commandList = new ArrayList<>();
		//Step-1 Open a File
		FileInputStream fi = new FileInputStream(getXLSPath());
		// Step - 2 Open a WorkBook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// Step -3 Open a WorkSheet
		HSSFSheet sheet = workBook.getSheetAt(0);
		// Step -4 Read the Rows
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			int columnCount =1;
			// this line give the current row
			Row currentRow = rows.next();
			// Step -5 Read the Cell inside the row
			Iterator<Cell> cells = currentRow.cellIterator();
			commandDTO = new CommandDTO();
			while(cells.hasNext()){
				// this line will give the current cells
				Cell currentCell = cells.next();
				if(columnCount==1){
					commandDTO.setCommand(currentCell.getStringCellValue());
				}
				else
				if(columnCount==2){
					commandDTO.setTarget(currentCell.getStringCellValue());
				}
				else
				if(columnCount==3){
					commandDTO.setValue(currentCell.getStringCellValue());
				}
				columnCount++;
			} // Cell Loop Ends
			commandList.add(commandDTO);
					
		} // Row Loop Ends
		workBook.close();
		fi.close();
		return commandList;
		
	}

}
