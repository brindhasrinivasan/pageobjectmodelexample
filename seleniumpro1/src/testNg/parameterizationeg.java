package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationeg {
    @Test
    @Parameters("Name")
    public void nameofperson(String name){
        System.out.println("name is :"+ name);
    }
}
