package Library;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelReadLib {
    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public ExcelReadLib(String excelPath){

        try {
            File src=new File(excelPath);
            FileInputStream fis=new FileInputStream(src);
            wb=new XSSFWorkbook(fis);
            sheet1=wb.getSheetAt(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetnumber, int row, int column) {
        String data=sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;

    }
}
