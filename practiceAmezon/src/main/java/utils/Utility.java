package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenShot(WebDriver driver,int T101) throws IOException
	{
	
	TakesScreenshot t=(TakesScreenshot)driver;
    File src=t.getScreenshotAs(OutputType.FILE);
    File dest=new File("D:\\SOFTWARE TESTING\\New folder\\test2.jpg");
    FileHandler.copy(src,dest);
    }

	public static void getDataFromExcel(int row,int col) throws EncryptedDocumentException, IOException
	{
		String path= "D:\\SOFTWARE TESTING\\New folder\\test.xlsx";
		InputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet("fb").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
	}
}