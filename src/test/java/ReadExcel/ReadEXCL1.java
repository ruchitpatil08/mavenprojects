package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadEXCL1 {
    public static void main(String[] args) throws Exception {
        File src=new File("C:\\Users\\ruchi\\IdeaProjects\\excel11\\ruchit11.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet1=wb.getSheetAt(0);

        String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from that cell is:"+data0);

        String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from that cell is:"+data1);
        int rowcount=sheet1.getLastRowNum();
        System.out.println("Total row count is"+rowcount);

        for(int i=0;i<=rowcount;i++){
            String data3=sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println("data from row "+(i+1)+" is "+data3);
        }
        wb.close();
    }
}
