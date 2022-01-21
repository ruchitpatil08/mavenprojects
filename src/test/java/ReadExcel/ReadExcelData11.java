package ReadExcel;

import Library.ExcelReadLib;

public class ReadExcelData11 {
    public static void main(String[] args) {
        ExcelReadLib excel=new ExcelReadLib("C:\\Users\\ruchi\\IdeaProjects\\excel11\\ruchit11.xlsx");
        System.out.println(excel.getData(0,1,1));

    }
}
