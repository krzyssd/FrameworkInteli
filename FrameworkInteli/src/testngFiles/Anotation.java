package testngFiles;


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

    @Test(groups = "Priority1")
    public void OpenBrowser(){
        System.out.println("OpenBrowser");
    }

    @Test(groups = "Priority2")
    @Parameters({"UserId"})
    //parametr ustawiony w pliku Parameter.xml
    public void FlifgtBooking(String UserId){
        System.out.println(UserId);
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
