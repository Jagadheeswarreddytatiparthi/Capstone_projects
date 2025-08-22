package StepDefinition;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
 
public class ExcelReader {
 
    public static String getCellValue(String filePath, String sheetName, int row, int col) {
        String cellValue = "";
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
 
            Sheet sheet = workbook.getSheet(sheetName);
            Row sheetRow = sheet.getRow(row);
            Cell cell = sheetRow.getCell(col);
 
            cellValue = cell.toString();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellValue;
    }

	public static List<List<String>> getSheetData(String filePath, String string) {
		
		return null;
	}
}
 
 
