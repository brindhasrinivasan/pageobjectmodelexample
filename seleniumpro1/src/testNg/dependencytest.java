package testNg;

import org.testng.annotations.Test;

public class dependencytest {
    @Test(priority = 0)
    public void startcar(){
        System.out.println("car started");
    }
    @Test(enabled =true,dependsOnMethods = "startcar")
    public void putmusic(){
        System.out.println("start music on");
    }
    @Test(dependsOnMethods = "putmusic")
    public void putgear(){
        System.out.println("put gear");
    }
    @Test(dependsOnMethods = "startcar")
    public void putbreak(){
        System.out.println("putbreak");
    }
}
