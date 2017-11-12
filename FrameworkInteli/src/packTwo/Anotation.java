package packTwo;


import org.testng.annotations.*;

/**
 * Created by DD on 2017-11-11.
 */
public class Anotation {

    @BeforeMethod
    public void UseridGeneretion(){
        System.out.println("UserIDgeneretion....");

    }
    @BeforeTest
    public void Cookies()
    {
        System.out.println("Delete cookies");
    }

    @Test
    public void OpenBrowser(){
        System.out.println("OpenBrowser");
    }

    @Test
    public void FlifgtBooking(){
        System.out.println("FlifgtBooking");
    }

    @AfterTest
    public void Cookiesclose() {
        System.out.println("Delete cookies after completing all test");
    }

    @AfterMethod
    public void cookiesclose(){
        System.out.println("Po kazdej methoddzie");
    }
}
