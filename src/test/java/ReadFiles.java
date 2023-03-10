import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadFiles {

		public static void main(String[] args) throws IOException {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\TestData\\data1.xlsx");
			XSSFWorkbook work = new XSSFWorkbook(file);
			XSSFSheet sheet = work.getSheet("Sheet1");
			
			int totalrows = sheet.getLastRowNum();
			int totalcells = sheet.getRow(1).getLastCellNum();
			System.out.println("No. of Rows: "+totalrows );
			System.out.println("No. of Cells: "+totalcells );
			
			// reading data
			
			for(int r = 0;r<=totalrows;r++) {
				XSSFRow currentRow = sheet.getRow(r); // stores the value of r
				for (int c =0;c<totalcells;c++) {
					String value = currentRow.getCell(c).toString();
					System.out.println(value +" ");
				}
				
			}
			System.out.println();
			work.close();
			file.close();
		}

	}