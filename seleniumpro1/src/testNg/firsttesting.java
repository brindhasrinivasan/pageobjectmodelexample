package testNg;

import org.testng.annotations.Test;

public class firsttesting {
    //to have a correct sequence use priority
    @Test(priority = 0)
    public void firsttestcase(){
        System.out.println("first method of execution");
    }
    /*@Test(priority = 1)
    public void secondtestcase(){
        System.out.println("second case for execution");
    }
    //to skip testcase use enabled
    @Test(priority = -1,enabled = false)
    public void thirdtestcase(){
        System.out.println("third testcase for execution");
    }
    @Test(priority = 2)
    public void fourthtestcase(){
        System.out.println("fourth case for execution");
    }*/
}
