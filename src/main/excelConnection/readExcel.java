//package excelConnection;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class readExcel {
//
//    public static void main(String[] args) {
//
//    }
//
//    public void ReadData() throws IOException {
//
//        String excelFilePath = ".src/main/excelConnection/ExcelSheeet.xlsx";
//        FileInputStream file = new FileInputStream(excelFilePath);
//
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
////        int rows = sheet.getLastRowNum();
////        int cols = sheet.getRow(0).getLastCellNum();
////
////        for (int r = 0; r < rows; r++) {
////            XSSFRow row = sheet.getRow(r);
////            for (int c = 0; c < cols; c++) {
////                XSSFCell cell = row.getCell(c);
////                switch (cell.getCellType()) {
////                    case STRING:
////                        System.out.print(cell.getStringCellValue());
////                        break;
////                    case NUMERIC:
////                        System.out.print(cell.getNumericCellValue());
////                        break;
////                }
////
////                System.out.print(" : ");
////            }
////
////            System.out.println();
////        }
//
//
//        Iterator iterator = sheet.iterator();
//        while (iterator.hasNext()) {
//            XSSFRow row = (XSSFRow) iterator.next();
//            Iterator cellIterator = row.cellIterator();
//            while (cellIterator.hasNext()) {
//                XSSFCell cell = (XSSFCell) cellIterator.next();
//                switch (cell.getCellType()) {
//                    case STRING:
//                        System.out.print(cell.getStringCellValue());
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        break;
//                }
//                System.out.print(" : ");
//            }
//            System.out.println();
//        }
//    }
//}
//
