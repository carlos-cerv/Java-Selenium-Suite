package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import static junit.framework.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresess();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }

}
