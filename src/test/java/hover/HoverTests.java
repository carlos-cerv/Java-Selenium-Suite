package hover;

import base.BaseTests;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1 (){
        pages.HoversPage hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
    }
}
