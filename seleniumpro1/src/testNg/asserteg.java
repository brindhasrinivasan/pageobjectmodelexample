package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserteg {
    @Test
    public void checkval(){
        String name="straw";
        Boolean val=false;
        Assert.assertFalse(val,"hello are u true");
        Assert.assertEquals(name,"straw");

    }


}
