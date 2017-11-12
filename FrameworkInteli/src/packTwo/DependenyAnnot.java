package packTwo;

import org.testng.annotations.Test;

/**
 * Created by DD on 2017-11-11.
 */
public class DependenyAnnot {

    @Test
    public void OpenBrowser(){
        System.out.println("OpeningBrowser");
    }

    @Test(dependsOnMethods = ("OpenBrowser"), alwaysRun = true)//alwaysrun jak Open broser bedzie Failure to i tak
    // sie odpali
    public void FlifgtBooking(){
        System.out.println("Executing FlifgtBooking");
    }

    @Test(enabled = false)//po ustawieniu na false jest disabled
    public void Payment(){
        System.out.println("New testCase");
    }

    @Test(timeOut = 5000)//w milisekundach bedzie czekac 5 s a jesli sie nie uda to bedzie failed
    public void Timeout(){
        System.out.println("Test timeout");
    }
}
