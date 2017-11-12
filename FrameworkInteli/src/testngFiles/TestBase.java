package testngFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by DD on 2017-11-11.
 */

public class TestBase {

    @Test
    public void Login() throws IOException {

        WebDriver driver = null;
        String file = "D:\\kurs\\Udemy\\Selenium i java\\Projekty\\FrameworkInteli\\src\\testngFiles\\datadriven" +
                ".properties";

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        System.out.println(prop.getProperty("username"));


        if(prop.getProperty("browser").contains("firefox")) {
            System.setProperty("gecko.driver", "C:\\Drivers\\gecko.exe");
            driver = new FirefoxDriver();
        }
        else if(prop.getProperty("browser").contains("chrome"))
        {    System.setProperty("chrome.driver", "C:\\Drivers\\chromedriver.exe");
             driver = new ChromeDriver();
        }
        else {
             driver = new InternetExplorerDriver();
        }

        driver.get(prop.getProperty("url"));
    }

    @Test
    public void software(){
        System.out.println("software");
    }

    @AfterSuite
    public void deintalsoftware(){
        System.out.println("I am the last");
    }
}


