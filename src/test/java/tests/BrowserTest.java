package tests;

import actions.BrowserActions;
import org.testng.annotations.Test;

public class BrowserTest extends  DefaultTest{


    @Test
    public void test () {

        BrowserActions bb = new BrowserActions(this.androidDevice);
        bb.perform();
    }

}
