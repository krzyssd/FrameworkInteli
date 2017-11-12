package excelDriver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by DD on 2017-11-11.
 */
public class ExcelDriver {
    public static FileInputStream  fis;
    public static XSSFWorkbook wb ;
    public static XSSFSheet sheet;
    public static XSSFRow r ;
    public static XSSFCell cell;
    public static String value ;



    public static void main(String[] args) throws IOException {

        getCelldata(100,1);



    }

     public static String getCelldata(int row, int col) throws IOException {

         //WorkBook ->Sheet -> Row -> Select kolumn (cell) ->grab/set value

         try {
             fis = new FileInputStream("D:\\kurs\\Udemy\\Selenium i java\\Projekty\\FrameworkInteli\\data" + ".xlsx");
             wb = new XSSFWorkbook(fis);
             sheet = wb.getSheet("Sheet1");
             r = sheet.getRow(row);
             cell = r.getCell(col);
             //boolean value = cell.getBooleanCellValue();
             value = cell.getStringCellValue();
             System.out.println(value);
         }
         catch (NullPointerException e){
             System.out.println("Podana przez Ciebie kolumna jest pusta, wprowadz poprawna wartosc!");
         }



         return value;}


    public static String getCelldata(int row, int col,String value) throws IOException {

        //WorkBook ->Sheet -> Row -> Select kolumn (cell) ->grab/set value

        try {
           /* fis = new FileInputStream("D:\\kurs\\Udemy\\Selenium i java\\Projekty\\FrameworkInteli\\data" + ".xlsx");
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheet("Sheet1");
            r = sheet.getRow(row);
            cell = r.getCell(col);
            //boolean value = cell.getBooleanCellValue();
            value = cell.getStringCellValue();
            System.out.println(value);


        */
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheet("Sheet1");
            r = sheet.getRow(row);
            cell = r.getCell(col);
            cell.setCellValue(value);


        }

        catch (NullPointerException e){
            System.out.println("Podana przez Ciebie kolumna jest pusta, wprowadz poprawna wartosc!");
        }



        return value;



        }


    }







