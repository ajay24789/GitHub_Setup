package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

//	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
//	
//		File file =  new File(AutoConstant.INPUT_PATH);
//		Workbook wb = WorkbookFactory.create(file);
//		String val = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
//		System.out.println(val);	
//	}
	
	public static String getcellData (String path, String sheet, int r, int c)
	{
	String v = "";
	
	try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
	catch(Exception e) {	
		}
	
	return v;
	}
	
	public static int getRowcount(String path, String sheet)
	{
		int rc = 0;
		
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));

			rc = wb.getSheet(sheet).getLastRowNum();
			}
		catch(Exception e) {	
		}
		return rc;
	}
	
}


