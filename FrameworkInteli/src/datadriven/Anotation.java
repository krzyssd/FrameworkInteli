package datadriven;


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

   //@Test(groups = "Priority1")
    public void OpenBrowser(){
        System.out.println("OpenBrowser");
    }

    //@Test(groups = "Priority2")
    public void FlifgtBooking(){
        System.out.println("FlifgtBooking");
    }

    @Test(dataProvider = "getData" )
    public void Userid(String username, String password, String id){
        System.out.println(username);
        System.out.println(password);
        System.out.println(id);
    }

    @AfterTest
    public void Cookiesclose() {
        System.out.println("Delete cookies after completing all test");
    }

    @AfterMethod
    public void cookiesclose(){
        System.out.println("Po kazdej methoddzie");
    }

    @DataProvider
    public Object[][] getData(){

        //Object[][] data = new Object[i][j];
        // i stands for number of times testcase should run np 2 razy
        //   j number of parameters it should send for one go

        Object[][] data = new Object[3][3];
        data[0][0] = "abcd";
        data[0][1] = "xyz";
        data[0][2] = "0  parameter";

        data[1][0] = "1abcd";
        data[1][1] = "1xyz";
        data[1][2] = "1  parameter";

        data[2][0] = "2abcd";
        data[2][1] = "2xyz";
        data[2][2] = "2 parameter";

        return data;

    }


    
}
