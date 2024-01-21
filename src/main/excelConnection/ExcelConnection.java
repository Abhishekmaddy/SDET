package excelConnection;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExcelConnection {



    public static void main(String[] args) {
        ExcelConnection ex = new ExcelConnection();
        List<List<String>> mainList = ReadExcelFile();
        for (List<String> subList : mainList) {
            for (String cellValue : subList) {
                System.out.println(cellValue);
            }
        }
        for (int i = 0; i <= mainList.size() - 1; i++) {
            for (int j = 0; j <= mainList.get(i).size() - 1; j++) {
                System.out.println(mainList.get(i).get(j));

            }
            //ExcelConnection ex = new ExcelConnection();
            //ExcelConnection.ExcelWrite("\\src\\main\\excelConnection\\ExcelSheeet.xlsx", "Sheet1", "1234556");
        }
    }


    public static List<List<String>> ReadExcelFile() {

        FileInputStream fis = null;
        XSSFWorkbook wb = null;
        //combination of rows and column
        List<List<String>> mainList = new ArrayList<List<String>>();
        try {
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\excelConnection\\ExcelSheeet.xlsx");
            if (f.exists()) {
                fis = new FileInputStream(f);
                wb = new XSSFWorkbook(fis);
                XSSFSheet sh = wb.getSheet("Sheet1");
                int rc = sh.getLastRowNum();
                //first row for fetching row
                for (int i = 1; i <= rc - 1; i++) {
                    XSSFRow row = sh.getRow(i);
                    int cc = row.getPhysicalNumberOfCells();
                    List<String> subList = new ArrayList<String>();
                    for (int j = 0; j <= cc - 1; j++) {
                        subList.add(row.getCell(j).getStringCellValue());
                    }
                    mainList.add(subList);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                wb.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mainList;
    }


    public static void ExcelWrite(String xlPath, String sheetName, String voucher) {
        XSSFWorkbook wb = null;
        XSSFSheet sh = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\excelConnection\\ExcelSheeet.xlsx");
            if (f.exists()) {
                 fis = new FileInputStream(f);
                 wb = new XSSFWorkbook(fis);
                 sh = wb.getSheet(sheetName);
                int rc = sh.getLastRowNum();
                for (int i = 1; i <= rc; i++) {
                    XSSFRow r = sh.getRow(i);
//                    DataFormatter df = new DataFormatter();
//                    String voucher = df.formatCellValue(r.getCell(i));

                    //String voucher= r.getCell(i).getStringCellValue().trim();
                    XSSFCell c = r.createCell(2);
                    c.setCellValue("PASS");
                }
                fos = new FileOutputStream(f);
                wb.write(fos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                wb.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
