package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by DD on 2017-11-11.
 */
public class Anotation2 {

    @BeforeSuite
    public void intallsoftware(){
        System.out.println("I am the First");
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
