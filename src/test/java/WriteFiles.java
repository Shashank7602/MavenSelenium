import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFiles {

	public static void main(String[] args) throws IOException {
	FileOutputStream File = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\data2.xlsx");
	XSSFWorkbook work = new XSSFWorkbook();
	XSSFSheet sheet = work.createSheet();
	// XSSFRow row1 = sheet.createRow(0);
	
	Scanner sc= new Scanner(System.in);
	for(int r =0;r<=3;r++) {
		XSSFRow currentRow = sheet.createRow(r);
		for(int c = 0;c<2;c++) {
			System.out.println("Enter the Value: ");
			String value = sc.next();
			currentRow.createCell(c).setCellValue(value);
		}
	}
	
	work.write(File);
	work.close();
	System.out.println("Data Inserted");
	}

}
