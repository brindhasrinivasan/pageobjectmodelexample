package testNg;

import org.testng.annotations.Test;

public class groupeg {
    @Test(groups = {"moto"})
    public void moto1(){
        System.out.println("hello moto1");
    }
    @Test(groups = {"moto"})
    public void moto2(){
        System.out.println("hello moto2");
    }
    @Test(groups = {"moto"})
    public void moto3(){
        System.out.println("hello moto3");
    }
    @Test(groups = {"apple"})
    public void apple1(){
        System.out.println("hello apple1");
    }
    @Test(groups = {"apple"})
    public void apple2(){
        System.out.println("hello apple2");
    }
    @Test(groups = {"apple"})
    public void apple3(){
        System.out.println("hello apple3");
    }
    @Test(groups = {"vivo"})
    public void vivo1(){
        System.out.println("hello vivo1");
    }
    @Test(groups = {"vivo"})
    public void vivo2(){
        System.out.println("hello vivo2");
    }
    @Test(groups = {"vivo"})
    public void vivo3(){
        System.out.println("hello vivo3");
    }
}
