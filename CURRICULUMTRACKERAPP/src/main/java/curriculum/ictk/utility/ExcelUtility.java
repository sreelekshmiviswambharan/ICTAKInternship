package curriculum.ictk.utility;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {
	public static XSSFWorkbook excelWbook;
    public static XSSFSheet excelSheet;
   public static String getCellData(int rowNum,int colNum) throws IOException
   {
    FileInputStream inp=new FileInputStream("C:\\Users\\Home\\Desktop\\New folder\\New folder\\newautomation\\New folder\\CURRICULUMTRACKERAPP\\src\\main\\resources\\Curriculum.xlsx");
    excelWbook= new XSSFWorkbook(inp);
    excelSheet=excelWbook.getSheetAt(0);
    return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();

     }	
}

