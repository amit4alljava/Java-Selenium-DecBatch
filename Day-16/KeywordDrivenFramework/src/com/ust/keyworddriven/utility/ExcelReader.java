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
