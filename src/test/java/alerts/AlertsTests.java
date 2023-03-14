package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert (){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }
}
